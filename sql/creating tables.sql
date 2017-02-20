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