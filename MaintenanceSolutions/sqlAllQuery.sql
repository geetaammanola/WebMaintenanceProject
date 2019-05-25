create database ms;

use ms;

/* Login Table */ 
CREATE TABLE `login` (
`id` int( 11 ) NOT NULL AUTO_INCREMENT ,
`fname` varchar( 30 ) NOT NULL ,
`lname` varchar( 30 ) NOT NULL ,
`email` varchar( 50 ) NOT NULL ,
`password` varchar( 128 ) NOT NULL ,
PRIMARY KEY ( `id` ) 
);

insert into login values(1,"moni","roy","moni@gmail.com","123");
insert into login values(2,"soni","k","soni@gmail.com","123");

select * from login; 

/* Product Table */ 
CREATE TABLE `product` (
`productId` int( 11 ) NOT NULL AUTO_INCREMENT ,
`productName` varchar( 30 ) NOT NULL ,
`price` int( 11 ) NOT NULL ,
`unit` int( 11 ) NOT NULL ,
`date` DATETIME NOT NULL DEFAULT NOW() ,
PRIMARY KEY ( `productId` ) 
);

select * from product;
insert into product values(101,"MotherBoard",35000,50,"2018-2-2","Computer");
insert into product values(102,"Condenser ",35000,50,"2018-1-4"," Air Conditioners");


/* Complain Record Table */ 
CREATE TABLE `complain` (
  `complainid` int(11) NOT NULL AUTO_INCREMENT,
   `complainer` varchar(45) DEFAULT NULL,
     `fridgeType` varchar(45) DEFAULT NULL,
     `issue` varchar(150) DEFAULT NULL,
      `email` varchar(100) DEFAULT NULL,
  `mobileNo` int(20) NOT NULL,
   `address` varchar(150) DEFAULT NULL,
   `App-date` date DEFAULT NULL,
  `App-slot` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`complainid`)
);


/* Engineer Record Table */ 
 CREATE TABLE `engineer` (
  `engineerId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobileNo` int NOT NULL,
   `doj` date DEFAULT NULL,
   `dob` date DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`engineerId`)
);





/* resolve Record Table */ 
CREATE TABLE `resolve` (
  `resolveid` int(11) NOT NULL AUTO_INCREMENT,
   `date` date DEFAULT NULL,
   `engineerName` varchar(45) DEFAULT NULL,
     `cmobileNo` varchar(20) DEFAULT NULL,
     `solDes` varchar(150) DEFAULT NULL,
      `part` varchar(100) DEFAULT NULL,
        `charges` int(11) DEFAULT NULL,
  PRIMARY KEY (`resolveid`)
);

insert into resolve values(1,"2019-5-8","Kabir singh",9876543211,"fan failed","new fan added");
insert into resolve values(2,"2019-3-7","manish ",98326574122,"fan failed","new fan added");

