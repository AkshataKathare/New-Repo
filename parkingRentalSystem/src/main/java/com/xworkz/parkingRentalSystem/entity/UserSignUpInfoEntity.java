package com.xworkz.parkingRentalSystem.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.xworkz.parkingRentalSystem.util.AdminLoginUtil;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Entity
@Table(name = "userSignUp")
@NamedQuery(name = "findByEmail", query = "select inf from UserSignUpInfoEntity as inf where inf.email=:em")
@NamedQuery(name = "findByOTP",query = "select info from UserSignUpInfoEntity as info where info.otp=:oTP")
public class UserSignUpInfoEntity extends AdminLoginUtil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String email;
	private String mobileNo;
	private int otp;
	private static final long OTP_VALID_DURATION = 1 * 60 * 1000;   // 5 minutes
    private Date otpRequestedTime;

	public UserSignUpInfoEntity() {
		super();
		log.info("Created UserSignUpInfoEntity using no-arg const");
	}

	public UserSignUpInfoEntity(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		log.info("Created UserSignUpInfoEntity using parameterised const");
	}
	
	public boolean isOTPRequired() {
        long currentTimeInMillis = System.currentTimeMillis();
        long otpRequestedTimeMillis = this.otpRequestedTime.getTime();
        if(otpRequestedTimeMillis + OTP_VALID_DURATION < currentTimeInMillis) {
            // otp expires
            return true;
        }
        return false;
    }

}
