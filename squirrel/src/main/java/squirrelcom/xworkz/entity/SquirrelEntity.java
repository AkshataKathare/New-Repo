package squirrelcom.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "squirrel")
@NamedQuery(name = "findAll", query = "select sq from SquirrelEntity as sq")
@NamedQuery(name = "findByName", query = "select s from SquirrelEntity as s where s.name=:byName")
@NamedQuery(name = "findByColor", query = "select nat from SquirrelEntity as nat where nat.color=:byColor")
public class SquirrelEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "color")
	private String color;

}