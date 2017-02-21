create table stock (
   STOCK_ID INT NOT NULL auto_increment,
   STOCK_CODE VstockARCHAR(10) default NULL,
   STOCK_NAME  VARCHAR(20) default NULL,
   PRIMARY KEY (STOCK_ID)
);


create table EMPLOYEE (
   id INT NOT NULL auto_increment,
   first_name VARCHAR(20) default NULL,
   last_name  VARCHAR(20) default NULL,
   salary     INT  default NULL,
   PRIMARY KEY (id)
);


create table Showrooms
(
	showroom_id INT NOT NULL auto_increment,
	manager VARCHAR(50) default NULL,
	location   VARCHAR(50) default NULL,
	
    PRIMARY KEY (showroom_id)
)

create table Cars
(
	car_id INT NOT NULL auto_increment,
	name  VARCHAR(50) default NULL,
	color    VARCHAR(50) default NULL,
	showroom_id INT REFERENCES 	Showrooms(showroom_id),    
	PRIMARY KEY (car_id)
)
