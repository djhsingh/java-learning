package djh.learn.java19;
import java.util.ArrayList;
import java.util.List;

public record Employee(int id, String name, String jobTitle,
                       String gender, double salary, String country){
}
 class Data {
  public static List<Employee> getEmployeesList() {
    List<Employee> list = new ArrayList<>();
    list.add(new Employee(1,"Shara Kelshaw","Marketing Manager","Female",4436,"Paraguay"));
    list.add(new Employee(2,"Kaine Kibel","Associate Professor","Male",4123,"Morocco"));
    list.add(new Employee(3,"Nilson Ripper","Environmental Specialist","Male",4228,"Russia"));
    list.add(new Employee(4,"Maye Tabner","Developer I","Female",4351,"Philippines"));
    list.add(new Employee(5,"Sidnee Parslow","Marketing Assistant","Male",4214,"Brazil"));
    list.add(new Employee(6,"Issi Brendish","Assistant Professor","Female",4204,"Afghanistan"));
    list.add(new Employee(7,"Merry Riddles","Clinical Specialist","Male",4714,"Sweden"));
    list.add(new Employee(8,"Felic Kearn","General Manager","Male",4100,"France"));
    list.add(new Employee(9,"Reagan Poxton","Operator","Male",4952,"Vietnam"));
    list.add(new Employee(10,"Timofei Baskeyfied","Community Outreach Specialist","Male",4566,"China"));
    list.add(new Employee(11,"Eimile Anstie","Senior Financial Analyst","Female",4714,"Kosovo"));
    list.add(new Employee(12,"Brennen Lavrick","VP Sales","Male",4370,"Malta"));
    list.add(new Employee(13,"Floris Birwhistle","Pharmacist","Female",4780,"Morocco"));
    list.add(new Employee(14,"Farica Stubbings","Speech Pathologist","Female",4526,"China"));
    list.add(new Employee(15,"Torrance McCullouch","Structural Analysis Engineer","Male",4607,"Philippines"));
    list.add(new Employee(16,"Dorena Ballentime","Chemical Engineer","Female",4629,"Canada"));
    list.add(new Employee(17,"Quintilla Dahlen","Nurse","Female",4890,"Colombia"));
    list.add(new Employee(18,"Brent Worgen","Programmer Analyst I","Male",4954,"Canada"));
    list.add(new Employee(19,"Brina MacTeague","Editor","Female",4472,"China"));
    list.add(new Employee(20,"Georgi Rubinow","Account Executive","Female",4101,"Philippines"));
    list.add(new Employee(21,"Sindee Denington","Business Systems Development Analyst","Female",4599,"Chile"));
    list.add(new Employee(22,"Chloe McLarens","Assistant Media Planner","Female",4378,"China"));
    list.add(new Employee(23,"Aurea Lakenton","Nuclear Power Engineer","Female",4458,"Peru"));
    list.add(new Employee(24,"Lorenzo Hancill","Occupational Therapist","Male",4999,"China"));
    list.add(new Employee(25,"Tammie Dallywater","Tax Accountant","Male",4705,"Brazil"));
    list.add(new Employee(26,"Jeff Stading","VP Product Management","Male",4549,"Macedonia"));
    list.add(new Employee(27,"Marcellus Pullinger","Structural Engineer","Male",4538,"China"));
    list.add(new Employee(28,"Berke Hambling","Pharmacist","Male",4480,"China"));
    list.add(new Employee(29,"Smitty Biford","General Manager","Male",4843,"Thailand"));
    list.add(new Employee(30,"Marcie Sidsaff","Clinical Specialist","Female",4856,"Micronesia"));
    list.add(new Employee(31,"Eldridge Serjeantson","Assistant Manager","Male",4732,"Greece"));
    list.add(new Employee(32,"Carola Kalkofer","Registered Nurse","Female",4377,"China"));
    list.add(new Employee(33,"Edee Feedham","Accounting Assistant IV","Female",4270,"Niger"));
    list.add(new Employee(34,"Lilith Nequest","Software Engineer III","Female",4782,"China"));
    list.add(new Employee(35,"Killie Dilleston","Structural Engineer","Male",4392,"Ukraine"));
    list.add(new Employee(36,"Melinda Halgarth","Quality Control Specialist","Female",4393,"Ireland"));
    list.add(new Employee(37,"Jeromy Bibby","Help Desk Technician","Male",4697,"China"));
    list.add(new Employee(38,"Tatiana Onslow","Account Representative II","Female",4322,"Japan"));
    list.add(new Employee(39,"Etan Andrysiak","Media Manager III","Male",4782,"Ukraine"));
    list.add(new Employee(40,"Gussy Luscott","Health Coach IV","Female",4371,"Portugal"));
    list.add(new Employee(41,"Rolando Griffitt","Senior Editor","Male",4848,"Indonesia"));
    list.add(new Employee(42,"Francis Guise","Paralegal","Male",4797,"Canada"));
    list.add(new Employee(43,"Eudora Lakes","VP Quality Control","Female",4145,"Portugal"));
    list.add(new Employee(44,"Curran Riccardelli","Recruiting Manager","Male",4704,"Sweden"));
    list.add(new Employee(45,"Horacio Bird","Research Assistant IV","Male",4087,"China"));
    list.add(new Employee(46,"Audrey Heinl","Civil Engineer","Female",4865,"Vietnam"));
    list.add(new Employee(47,"Donavon Brownhall","Administrative Assistant II","Male",4228,"Sweden"));
    list.add(new Employee(48,"Tobe Wison","Administrative Assistant II","Male",4054,"Brazil"));
    list.add(new Employee(49,"Tonye Jallin","Graphic Designer","Female",4509,"China"));
    list.add(new Employee(50,"Guntar Fleote","Analog Circuit Design manager","Male",4813,"Poland"));
    list.add(new Employee(51,"Stormy Leirmonth","Nurse Practicioner","Female",4243,"Thailand"));
    list.add(new Employee(52,"Margit Selkirk","Structural Engineer","Female",4037,"Philippines"));
    list.add(new Employee(53,"Sal Mangenot","Accountant I","Male",4819,"United States"));
    list.add(new Employee(54,"Mellicent Oldham","Research Assistant I","Female",4510,"Indonesia"));
    list.add(new Employee(55,"Farrah Steljes","Nurse Practicioner","Female",4777,"Indonesia"));
    list.add(new Employee(56,"Briano Niblock","Senior Sales Associate","Male",4126,"China"));
    list.add(new Employee(57,"Joeann Pow","VP Accounting","Female",4277,"Sri Lanka"));
    list.add(new Employee(58,"Samara Mussett","VP Product Management","Female",4717,"Peru"));
    list.add(new Employee(59,"Ephrem Bernet","VP Marketing","Male",4787,"Uganda"));
    list.add(new Employee(60,"Lizzie Garrad","Registered Nurse","Female",4681,"Philippines"));
    list.add(new Employee(61,"Heinrick Whitloe","Software Engineer IV","Male",4931,"Japan"));
    list.add(new Employee(62,"Agnola Itter","Database Administrator IV","Polygender",4482,"Nicaragua"));
    list.add(new Employee(63,"Skell Sergison","Data Coordiator","Male",4252,"Madagascar"));
    list.add(new Employee(64,"Dallas Bridie","Structural Engineer","Male",4810,"Vietnam"));
    list.add(new Employee(65,"Gaylene Grenshields","Compensation Analyst","Female",4672,"China"));
    list.add(new Employee(66,"Dot Ianson","Accounting Assistant II","Female",4643,"Russia"));
    list.add(new Employee(67,"Stephenie Gumbley","Software Consultant","Female",4303,"China"));
    list.add(new Employee(68,"Tova Hinder","Social Worker","Female",4101,"Thailand"));
    list.add(new Employee(69,"Renae Cadalleder","Clinical Specialist","Non-binary",4735,"China"));
    list.add(new Employee(70,"Merle McFfaden","Business Systems Development Analyst","Female",4183,"Sweden"));
    list.add(new Employee(71,"Gan Surgeoner","Staff Accountant IV","Male",4095,"China"));
    list.add(new Employee(72,"Darnell Cassam","Marketing Manager","Male",4683,"Indonesia"));
    list.add(new Employee(73,"Woodrow De Maine","Analyst Programmer","Male",4040,"Haiti"));
    list.add(new Employee(74,"Inness Latey","Speech Pathologist","Male",4349,"Indonesia"));
    list.add(new Employee(75,"Darelle Gherardesci","Biostatistician I","Female",4277,"United States"));
    list.add(new Employee(76,"Byrle Conkey","Software Consultant","Male",4476,"Philippines"));
    list.add(new Employee(77,"Shawna Tomanek","Software Test Engineer I","Female",4574,"China"));
    list.add(new Employee(78,"Dell Butner","Mechanical Systems Engineer","Male",4225,"Indonesia"));
    list.add(new Employee(79,"Norah L'Homme","Tax Accountant","Female",4823,"Indonesia"));
    list.add(new Employee(80,"Flori Mitie","Graphic Designer","Genderqueer",4498,"Portugal"));
    list.add(new Employee(81,"Gaby Jenkison","Research Nurse","Male",4389,"France"));
    list.add(new Employee(82,"Dieter Domenget","Systems Administrator IV","Non-binary",4699,"Panama"));
    list.add(new Employee(83,"Rosco Reuss","Structural Engineer","Male",4973,"Australia"));
    list.add(new Employee(84,"Prue Chauvey","Senior Financial Analyst","Female",4336,"Indonesia"));
    list.add(new Employee(85,"Arny Impy","Engineer IV","Male",4120,"China"));
    list.add(new Employee(86,"Tom Trusse","Graphic Designer","Male",4781,"China"));
    list.add(new Employee(87,"Fina Filewood","Staff Scientist","Female",4479,"Indonesia"));
    list.add(new Employee(88,"Jaclin Gadd","Recruiter","Female",4594,"Syria"));
    list.add(new Employee(89,"Marlane Breinlein","Media Manager IV","Female",4395,"Philippines"));
    list.add(new Employee(90,"Cathyleen Standley","VP Marketing","Female",4823,"Russia"));
    list.add(new Employee(91,"Aymer Dorow","Information Systems Manager","Male",4626,"China"));
    list.add(new Employee(92,"Pavlov Nelthropp","Account Coordinator","Male",4345,"Colombia"));
    list.add(new Employee(93,"Cass Huckabe","Nuclear Power Engineer","Female",4300,"Uganda"));
    list.add(new Employee(94,"Gorden Malan","Programmer II","Male",4265,"Sweden"));
    list.add(new Employee(95,"Frants Renneke","Nurse Practicioner","Male",4380,"Thailand"));
    list.add(new Employee(96,"Culley Pidgin","Geological Engineer","Female",4586,"France"));
    list.add(new Employee(97,"Jorrie Kesby","Recruiting Manager","Female",4695,"China"));
    list.add(new Employee(98,"Fanchon Tatchell","Financial Advisor","Female",4114,"Serbia"));
    list.add(new Employee(99,"Fannie Deuss","Data Coordiator","Female",4159,"China"));
    list.add(new Employee(100,"Bryan O'Lennane","Administrative Officer","Female",4018,"Ethiopia"));
    return list;
  }
}