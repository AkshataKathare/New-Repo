package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.MLADTO;

public class MLARunner {

	public static void main(String[] args) {

		Collection<MLADTO> mladtos = new ArrayList<>();
		mladtos.add(new MLADTO("Shashikala Annasaheb Jolle", 54, "Nippani", "BJP", true, "Female"));
		mladtos.add(new MLADTO("Ganesh Hukkeri", 45, "Chikkodi-Sadalga", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Mahesh Kumathalli", 39, "Athani", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Srimant Patil", 56, "Kagwad", "BJP", true, "Female"));
		mladtos.add(new MLADTO("P. Rajeev", 40, "Kudachi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("D. M. Basavantaray", 40, "Kittur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Duryodhan Mahalingappa Aihole", 46, "Raibag", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Umesh Katti", 65, "Hukkeri", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Balachandra Jarkiholi", 59, "Arabhavi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Ramesh Jarkiholi", 48, "Gokak", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Satish Jarkiholi", 50, "Yemkanmardi", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Anil S Benake", 50, "Belagavi Uttar", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Abhay Patil", 46, "Belagavi Dakshin", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Lakshmi Hebbalkar", 59, "Belagavi Rural", "Congress", true, "Female"));
		mladtos.add(new MLADTO("Anjali Nimbalkar", 47, "Khanapur", "BJP", true, "Female"));
		mladtos.add(new MLADTO("Mahantesh Kaujlagi", 49, "Bailhongal", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Anand Mamani", 67, "Saundatti Yellamma", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Mahadevappa Shivalingappa Yadawad", 43, "Ramdurg", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Govind M. Karjol", 42, "Mudhol", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Siddu Savadi", 46, "Terdal", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Anand Nyamagouda", 48, "Jamkhandi", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Murugesh Nirani", 59, "Bilgi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Siddaramaiah", 70, "Badami", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Veerabhadrayya Charantimath", 65, "Bagalkot", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Doddanagowda Patil", 45, "Hungund", "BJP", true, "Male"));
		mladtos.add(new MLADTO("A. S. Patil", 45, "Muddebihal", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Somanagouda Patil", 56, "Devar Hippargi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Shivanand S Patil", 50, "Basavana Bagevadi", "Congress", true, "Male"));
		mladtos.add(new MLADTO("M. B. Patil", 62, "Babaleshwar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Basangouda Patil Yatnal", 53, "Bijapur City", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Devanand Fulasing Chavan", 47, "Nagathan", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Y. V. Patil", 37, "Indi", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Bhusanur Ramesh Balappa", 45, "Sindagi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("M. Y. Patil", 56, "Afzalpur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Ajay Dharam Singh", 40, "Jevargi", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Narasimhanayak", 67, "Shorapur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Sharanabasappa Gouda Darshanapur", 48, "Shahapur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Venkatreddy Mudnal", 56, "Yadgir", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Naganagowda Kandukar", 59, "Gurmitkal", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Priyank M. Kharge", 67, "Chittapur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Rajkumar Patil", 35, "Sedam", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Avinash Jadhav", 57, "Chincholi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Basavaraj Mattimud", 46, "Gulbarga Rural", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Dattatraya C. Patil", 49, "Gulbarga Dakshin", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Kaneez Fatima", 56, "Gulbarga Uttar", "Congress", true, "Female"));
		mladtos.add(new MLADTO("Guttedar Subhash Rukmayya", 46, "Aland", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Sharanu Salagar", 67, "Basavakalyan", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Rajshekar Basavaraj Patil", 47, "Homnabad", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Bandeppa Kashempur", 42, "Bidar South", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Rahim Khan", 46, "Bidar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Eshwara Bhimanna Khandre", 48, "Bhalki", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Prabhu Chavhan", 59, "Aurad", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Basanagouda Daddal", 70, "Raichur Rural", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Dr. Shivaraj Patil S", 65, "Raichur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Raja Venkatappa Nayak", 45, "Manvi", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Shivanagouda Naik", 45, "Devadurga", "BJP", true, "Male"));
		mladtos.add(new MLADTO("D. S. Hoolageri", 56, "Lingsugur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Venkatrao Nadagouda", 50, "Sindhanur", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Basanagouda Turvihal", 62, "Maski", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Amaregouda Linganagouda Patil", 53, "Kushtagi", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Basavaraj Dhadesugur", 54, "Kanakagiri", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Paranna Munavalli", 45, "Gangawati", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Achar Halappa Basappa", 39, "Yelburga", "BJP", true, "Male"));
		mladtos.add(new MLADTO("K. Raghavendra", 56, "Koppal", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Ramappa Lamani", 40, "Shirahatti", "BJP", true, "Male"));
		mladtos.add(new MLADTO("H. K. Patil", 40, "Gadag", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Kalakappa Bandi", 46, "Ron", "BJP", true, "Male"));
		mladtos.add(new MLADTO("C. C. Patil", 65, "Nargund", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Patil Munenakoppa Shankar", 59, "Navalgund", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Kusuma Shivalli", 48, "Kundgol", "Congress", true, "Female"));
		mladtos.add(new MLADTO("Amrupayyappa Desai", 50, "Dharwad", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Abbayya Prasad", 55, "Hubli-Dharwad-East", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Jagadish Shettar", 46, "Hubli-Dharwad-Central", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Aravind Bellad", 59, "Hubli-Dharwad-West", "BJP", true, "Male"));
		mladtos.add(new MLADTO("C. M. Nimbannavar", 47, "Kalghatgi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("R. V. Deshapande", 67, "Haliyal", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Roopali Naik", 44, "Karwar", "BJP", true, "Female"));
		mladtos.add(new MLADTO("Dinakar Keshav Shetty", 43, "Kumta", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Sunil Biliya Naik", 42, "Bhatkal", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Vishweshwar Hegde", 56, "Sirsi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Arbail Shivaram Hebbar", 48, "Yellapur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Srinivas Mane", 59, "Hangal", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Basavaraj Bommai", 56, "Shiggaon", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Neharu Olekar", 65, "Haveri(SC)", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Ballary Virupakshappa Rudrappa", 45, "Ranibennur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("B. C. Patil", 46, "Hirekerur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Arunkumar Guththur", 56, "Ranibennur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("P. T. Parameshwar Naik", 50, "Hadagalli", "Congress", true, "Male"));
		mladtos.add(new MLADTO("L.B.P. Bheemanaik", 56, "Hagaribommanahalli	", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Anand Singh", 53, "Vijayanagara", "BJP", true, "Male"));
		mladtos.add(new MLADTO("J.N. Ganesh", 47, "Kampli", "Congress", true, "Male"));
		mladtos.add(new MLADTO("M. S. Somalingappa", 37, "Siruguppa", "BJP", true, "Male"));
		mladtos.add(new MLADTO("B. Nagendra", 45, "Bellary Rural", "Congress", true, "Male"));
		mladtos.add(new MLADTO("G. Somashekara Reddy", 56, "Bellary City", "BJP", true, "Male"));
		mladtos.add(new MLADTO("E. Tukaram", 40, "Sandur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("N. Y. Gopalakrishna", 67, "Kudligi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("B. Sreeramulu", 48, "Molakalmuru", "BJP", true, "Male"));
		mladtos.add(new MLADTO("T. Raghumurthy", 56, "Challakere", "Congress", true, "Male"));
		mladtos.add(new MLADTO("G. H. Thippareddy", 59, "Chitradurga", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Poornima Krishnappa", 67, "Hiriyur", "BJP", true, "Female"));
		mladtos.add(new MLADTO("Gulhatty D. Shekhar", 35, "Hosadurga", "BJP", true, "Male"));
		mladtos.add(new MLADTO("M. Chandrappa", 57, "Holalkere", "BJP", true, "Male"));
		mladtos.add(new MLADTO("S. V. Ramachandra", 46, "Jagalur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("G. Karunakara Reddy", 49, "Harapanahalli", "BJP", true, "Male"));
		mladtos.add(new MLADTO("S. Ramappa", 56, "Harihar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("S. A. Ravindranath", 46, "Davanagere North", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Shamanur Shivashankarappa", 67, "Davanagere South", "Congress", true, "Male"));
		mladtos.add(new MLADTO("N. Linganna", 47, "Mayakonda", "BJP", true, "Male"));
		mladtos.add(new MLADTO("K. Madal Veerupakshappa", 42, "Channagiri", "BJP", true, "Male"));
		mladtos.add(new MLADTO("M. P. Renukacharya", 46, "Honnali", "BJP", true, "Male"));
		mladtos.add(new MLADTO("K. B. Ashok Naik", 48, "Shimoga Rural", "BJP", true, "Male"));
		mladtos.add(new MLADTO("B.K. Sangameshwara", 59, "Bhadravati", "Congress", true, "Male"));
		mladtos.add(new MLADTO("K. S. Eshwarappa", 70, "Shimoga", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Araga Jnanendra", 65, "Tirthahalli", "BJP", true, "Male"));
		mladtos.add(new MLADTO("B. S. Yeddyurappa", 45, "Shikaripura", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Kumar Bangarappa", 45, "Soraba", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Hartalu Halappa", 56, "Sagar", "BJP", true, "Male"));
		mladtos.add(new MLADTO("B. M. Sukumar Shetty", 50, "Baindur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Halady Srinivas Shetty", 62, "Kundapura", "BJP", true, "Male"));
		mladtos.add(new MLADTO("K. Raghupati Bhat", 53, "Udupi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Lalaji Mendon", 54, "Kapu", "BJP", true, "Male"));
		mladtos.add(new MLADTO("V. Sunil Kumar", 45, "Karkal", "BJP", true, "Male"));
		mladtos.add(new MLADTO("T. D. Rajegowda", 39, "Sringeri", "Congress", true, "Male"));
		mladtos.add(new MLADTO("M. P. Kumaraswamy", 56, "Mudigere", "BJP", true, "Male"));
		mladtos.add(new MLADTO("C. T. Ravi", 40, "Chikmagalur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("D. S. Suresh", 40, "Tarikere", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Belliprakash", 46, "Kadur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("J. C. Madhuswamy", 65, "Chiknayakanhalli", "BJP", true, "Male"));
		mladtos.add(new MLADTO("B. C. Nagesh", 59, "Tiptur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Jayaram A S", 48, "Turuvekere", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Dr H.D. Ranganath", 50, "Kunigal", "Congress", true, "Male"));
		mladtos.add(new MLADTO("G. B. Jyothi Ganesh", 55, "Tumkur City", "BJP", true, "Female"));
		mladtos.add(new MLADTO("D. C. Gowrishankar", 46, "Tumkur Rural", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Dr. G. Parameshwara", 59, "Koratagere", "Congress", true, "Male"));
		mladtos.add(new MLADTO("S. R. Srinivas", 47, "Gubbi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("C. M. Rajesh Gowda", 67, "Sira", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Venkata Ramanappa", 44, "Pavagada", "Congress", true, "Male"));
		mladtos.add(new MLADTO("M.V. Veerabhadraiah", 43, "Madhugiri", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("N. H. Shivashankara Reddy", 42, "Gauribidanur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("S. N. Subbareddy", 56, "Bagepalli", "Congress", true, "Male"));
		mladtos.add(new MLADTO("K. Sudhakar", 48, "Chikkaballapur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("V. Muniyappa", 59, "Sidlaghatta", "Congress", true, "Male"));
		mladtos.add(new MLADTO("J. K. Krishnareddy", 56, "Chintamani", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("K. R. Ramesh Kumar", 65, "Srinivasapur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("H. Nagesh", 45, "Mulbagal", "Congress", true, "Male"));
		mladtos.add(new MLADTO("M. Roopakala", 46, "Kolar Gold Field", "Congress", true, "Female"));
		mladtos.add(new MLADTO("S. N. Narayanaswamy K. M", 56, "Bangarapet", "Congress", true, "Male"));
		mladtos.add(new MLADTO("K. Srinivasa Gowda", 50, "Kolar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("K. Y. Nanjegowda", 56, "Malur	", "Congress", true, "Male"));
		mladtos.add(new MLADTO("S. R. Vishwanath", 53, "Yelahanka", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Byrathi Basavaraj", 47, "K. R. Pura", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Krishna Byre Gowda", 37, "Byatarayanapura", "Congress", true, "Male"));
		mladtos.add(new MLADTO("S. T. Somashekar", 45, "Yeshwanthpur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Munirathna", 56, "Rajarajeshwari Nagar", "BJP", true, "Male"));
		mladtos.add(new MLADTO("R. Manjunatha", 40, "Dasarahalli", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("K. Gopalaiah", 67, "Mahalakshmi Layout", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Dr. C.N. Ashwath Narayan", 48, "Malleshwaram", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Byrathi Suresh", 56, "Hebbal", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Akhanda Srinivas Murthy", 59, "Pulakeshinagar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("K. J. George", 67, "Sarvagnanagar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("S. Raghu", 35, "C. V. Raman Nagar", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Rizwan Arshad", 57, "Shivajinagar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("N. A. Haris", 46, "Shanti Nagar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Dinesh Gundu Rao", 49, "Gandhi Nagar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("S. Suresh Kumar", 56, "Rajaji Nagar", "BJP", true, "Male"));
		mladtos.add(new MLADTO("V. Somanna", 46, "Govindraj Nagar", "BJP", true, "Male"));
		mladtos.add(new MLADTO("M. Krishnappa", 67, "Vijay Nagar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Zameer Ahmed Khan", 47, "Chamrajpet", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Uday B. Garudachar", 42, "Chickpet", "BJP", true, "Male"));
		mladtos.add(new MLADTO("L. A. Ravi Subramanya", 46, "Basavanagudi", "BJP", true, "Male"));
		mladtos.add(new MLADTO("R. Ashoka", 48, "Padmanaba Nagar", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Ramalinga Reddy", 59, "B.T.M. Layout", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Soumya Reddy", 70, "Jayanagar", "Congress", true, "Female"));
		mladtos.add(new MLADTO("Aravind Limbavali", 65, "Mahadevapura", "BJP", true, "Male"));
		mladtos.add(new MLADTO("M Satish Reddy", 45, "Bommanahalli", "BJP", true, "Male"));
		mladtos.add(new MLADTO("M. Krishnappa", 45, "Bangalore South", "BJP", true, "Male"));
		mladtos.add(new MLADTO("B.Shivanna", 56, "Anekal", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Sharath Kumar Bachegowda", 50, "Hoskote", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Nisarga Narayanaswamy L.N", 62, "Devanahalli", "Janata Dal", false, "Female"));
		mladtos.add(new MLADTO("T. Venkataramanaiah", 53, "Doddaballapur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Dr. K. Srinavasamurthy", 46, "Nelamangala", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("A. Manjunath", 48, "Magadi", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Anitha Kumaraswamy", 59, "Ramanagara", "Janata Dal", false, "Female"));
		mladtos.add(new MLADTO("D. K. Shivakumar", 70, "Kanakapura", "Congress", true, "Male"));
		mladtos.add(new MLADTO("H. D. Kumaraswamy", 65, "Channapatna", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Dr. K. Annadani", 45, "Malavalli", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("D. C. Thammanna", 45, "Maddur", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("C. S. Puttaraju", 56, "Melukote", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("M. Srinivas", 50, "Mandya", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Ravindra Srikantaiah", 62, "Shrirangapattana", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Suresh Gowda", 46, "Nagamangala", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Narayana Gowda", 48, "Krishnarajpet", "BJP", true, "Male"));
		mladtos.add(new MLADTO("C. N. Balakrishna", 59, "Shravanabelagola", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("K. M. Shivalingegowda", 70, "Arsikere", "Congress", true, "Male"));
		mladtos.add(new MLADTO("K. S. Lingesha", 65, "Belur", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Preetham J. Gowda", 45, "Hassan", "BJP", true, "Male"));
		mladtos.add(new MLADTO("H. D. Revanna", 45, "Holenarasipur", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("A. T. Ramaswamy", 56, "Arkalgud", "Congress", true, "Male"));
		mladtos.add(new MLADTO("H. K. Kumaraswamy", 50, "Sakleshpur", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("Harish Poonja", 62, "Belthangady", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Umanatha A. Kotian", 46, "Moodabidri", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Bharath Shetty", 48, "Mangalore City North", "BJP", true, "Male"));
		mladtos.add(new MLADTO("D. Vedavyas Kamath", 59, "Mangalore City South", "BJP", true, "Male"));
		mladtos.add(new MLADTO("U. T. Khader", 70, "Mangalore", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Rajesh Naik", 65, "Bantval", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Sanjeeva Matandoor", 45, "Puttur", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Angara S", 45, "Sullia", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Appachu Ranjan", 56, "Madikeri", "BJP", true, "Male"));
		mladtos.add(new MLADTO("K. G. Bopaiah", 50, "Virajpet", "BJP", true, "Male"));
		mladtos.add(new MLADTO("K. Mahadeva", 62, "Periyapatna", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("S. R. Mahesh", 46, "Krishnarajanagara", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("H. P. Manjunath", 48, "Hunsuru", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Anil Kumar C.", 59, "Heggadadevankote", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Harshavardhan B.", 70, "Nanjangud", "BJP", true, "Male"));
		mladtos.add(new MLADTO("GT Devegowda", 65, "Chamundeshwari", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("S. A. Ramadas", 45, "Krishnaraja", "BJP", true, "Male"));
		mladtos.add(new MLADTO("L. Nagendra", 45, "Chamaraja", "BJP", true, "Male"));
		mladtos.add(new MLADTO("Tanveer Sait", 56, "Narasimharaja", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Yathindra S.", 50, "Varuna", "Congress", true, "Male"));
		mladtos.add(new MLADTO("Ashvin Kumar M.", 62, "T Narasipura", "Janata Dal", false, "Male"));
		mladtos.add(new MLADTO("R. Narendra", 45, "Hanur", "Congress", true, "Male"));
		mladtos.add(new MLADTO("N. Mahesh", 56, "Kollegal", "BJP", true, "Male"));
		mladtos.add(new MLADTO("C. Puttarangashetty", 50, "Chamrajanagar", "Congress", true, "Male"));
		mladtos.add(new MLADTO("C.S. Niranjan Kumar", 62, "Gundlupet", "BJP", true, "Male"));

		System.out.println(mladtos.size());

		System.out.println("MLAs who's age is above 50");

		mladtos.stream().filter(e -> e.getAge() > 50)
				.forEach(mla -> System.out.println(mla.getName() + " Age :" + mla.getAge()));

		System.out.println("******* ");

		System.out.println("MLAs who's age is below 50");

		mladtos.stream().filter(e -> e.getAge() < 50)
				.forEach(mla -> System.out.println(mla.getName() + " Age :" + mla.getAge()));

		System.out.println("******* ");

		System.out.println("All male MLAs");

		mladtos.stream().filter(e -> e.getGender().equals("Male")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("******* ");

		System.out.println("All female MLAs");

		mladtos.stream().filter(e -> e.getGender().equals("Female")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("******* ");

		System.out.println("Sorting Collection by party in ascending order");

		mladtos.stream().sorted((ref1, ref2) -> ref1.getParty().compareTo(ref2.getParty())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("******* ");

		System.out.println("Sorting collection by name in ascending order");

		mladtos.stream().sorted((ref1, ref2) -> ref1.getName().compareTo(ref2.getName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("******* ");

		System.out.println("Sorting collection by age in descending order");

		mladtos.stream().sorted((ref1, ref2) -> ref2.getAge().compareTo(ref1.getAge())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("******* ");

		System.out.println("Collecting all the MLAs by party");

		mladtos.stream().filter(ele -> ele.getParty().equals("BJP")).collect(Collectors.toList())
				.forEach(e -> System.out.println("BJP MLAs :" + e));

		System.out.println("******* ");

		System.out.println("Unique parties");

		mladtos.stream().map(ele -> ele.getParty()).collect(Collectors.toSet()).forEach(e -> System.out.println(e));

		System.out.println("******* ");

		System.out.println("All MLAs whose age is above 50 and party is BJP");

		mladtos.stream().filter(mla -> mla.getAge() > 50 && mla.getParty().equals("BJP")).collect(Collectors.toList())
				.forEach(e -> System.out.println("MLA :" + e.getName()));

		System.out.println("******* ");

		System.out.println("All independent MLAs");

		mladtos.stream().filter(e -> !e.isIndependent()).collect(Collectors.toList())
				.forEach(mla -> System.out.println("Independent MLA :" + mla.getName()));

	}

}
