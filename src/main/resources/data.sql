

insert into ITS_Profile (candidateID, first_Name, last_Name, date_Of_Birth,
gender, street, location, city, state, pincode, mobile_No, emailID)
values ('sa1234','savietha','maran','2000-04-01','female','yamunai',
'pondy', 'pondy', 'pondy', '605003','9876787678', 'savi@gmail.com' );

insert into ITS_Profile (candidateID, first_Name, last_Name, date_Of_Birth,
gender, street, location, city, state, pincode, mobile_No, emailID)
values ('Ru1234','Rudra','Pradap','2000-07-01','male','Floor India',
'Trichy Road', 'Coimbatore', 'Tamil Nadu', '605003','9878976678', 'Rudra@gmail.com' );

insert into ITS_Candidate (candidateID, primary_Skills, secondary_Skills, 
experience, qualification,designation, notice_Period, location, share_Details)
values ('sa1234','c','java',0,'Btech','cse',0,'Pondy',1);

insert into ITS_Candidate (candidateID, primary_Skills, secondary_Skills, 
experience, qualification,designation, notice_Period, location, share_Details)
values ('Ru1234','Python','java',1,'Mtech','cse',0,'Trichy Road',1);


insert into ITS_Profile (candidateID, first_Name, last_Name, date_Of_Birth,gender, street, location, city, state, pincode, mobile_No, emailID)
values ('jo1234','John','Luke','1993-05-01','male','nehru','lawspet', 'pondy', 'pondy', '605054','9467789832', 'john@gmail.com' );

insert into ITS_Profile (candidateID, first_Name, last_Name, date_Of_Birth,gender, street, location, city, state, pincode, mobile_No, emailID)
values ('ja1234','Jack','Levi','1993-06-17','male','mission','muthialpet', 'pondy','pondy', '605054','9467789832', 'john@gmail.com' );


insert into ITS_Profile (candidateID, first_Name, last_Name, date_Of_Birth,gender, street, location, city, state, pincode, mobile_No, emailID)
values ('ro1234','Rose','Ryan','1994-02-29','female','nehra','pondy', 'pondy', 'pondy', '605017','3578887697', 'rose@gmail.com' );


insert into ITS_Candidate (candidateID, primary_Skills, secondary_Skills, experience, qualification,designation, notice_Period, location, share_Details)
values ('jo1234','java','python',0,'Btech','CSE',3,'Pondy',0);

insert into ITS_Candidate (candidateID, primary_Skills, secondary_Skills, experience, qualification,designation, notice_Period, location, share_Details)
values ('ja1234','c','php',1,'Btech','',0,'Pondy',0);

insert into ITS_Candidate (candidateID, primary_Skills, secondary_Skills, experience, qualification,designation, notice_Period, location, share_Details)
values ('ro1234','c','java',2,'BE','it',1,'Pondy',0);

insert into interview values('102','jo1234','jo7898','07-04-2022','12am',0,'09-04-2022','2pm','',1,'c++','jo2345',0);

insert into interview values('103','ja1234','ja7898','07-04-2022','10am',0,'10-04-2022','3pm','',1,'java','ja2345',0);



insert into Register values ('sa2345','11-03-1997', 'sangu@gmail.com','sangeetha','female',
'raju','pondy','8776567652','sangu123','tech');

insert into Register values ('ra7898','11-03-1997', 'ramesh@gmail.com','ramesh','male',
'raju','pondy','8776789692','ramesh123','hr');

insert into Credentials values ('sa2345', 0, 'sangu123', 'T');

insert into Credentials values ('jo2345', 0, 'Jo123', 'T');

insert into Credentials values ('ja2345', 0, 'Jaga123', 'T');

insert into Credentials values ('ra7898', 0, 'ramesh123', 'H');

insert into Credentials values ('jo7898', 0, 'john123', 'H');

insert into Credentials values ('ja7898', 0, 'jack123', 'H');

insert into Credentials values ('admin', 0, 'admin', 'A');

insert into interview values('100','sa1234','ra7898','28-03-2022','11am',0,'01-04-2022',
'3pm','not available',1,'c','sa2345',0);

insert into interview values('101','Ru1234','ra7898','26-03-2022','10am',0,'29-03-2022',
'2pm','not available',1,'Python','sa2345',0);

insert into Shared_candidates (candidateID, primary_Skills, secondary_Skills, 
experience, qualification,designation, notice_Period, location)
values ('Ru1234','Python','java',1,'Mtech','cse',0,'Trichy Road');

insert into Shared_candidates (candidateID, primary_Skills, secondary_Skills, experience, qualification,designation, notice_Period, location)
values ('jo1234','java','python',0,'BTech','CSE',3,'Pondy');

insert into Shared_candidates (candidateID, primary_Skills, secondary_Skills, experience, qualification,designation, notice_Period, location)
values ('ja1234','c','php',1,'BCA','ECE',0,'Pondy');

insert into Shared_candidates (candidateID, primary_Skills, secondary_Skills, experience, qualification,designation, notice_Period, location)
values ('ro1234','c','java',2,'BE','it',1,'Pondy');


insert into Shared_interviews values('101','Ru1234','ra7898','26-03-2022','10am',0,'29-03-2022',
'2pm','not available','Python','sa2345',0);

insert into Shared_interviews values('102','jo1234','jo7898','07-04-2022','12am',0,'09-04-2022','2pm','not available','c++','jo2345',0);

insert into Shared_interviews values('103','ja1234','ja7898','07-04-2022','10am',0,'10-04-2022','3pm','not available','java','ja2345',0);












