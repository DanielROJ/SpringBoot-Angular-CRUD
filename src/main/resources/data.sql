

DROP TABLE IF EXISTS employ;

create  table employ(
  idEmploy int not null ,
  nameEmploy varchar(100) not null,
  rol varchar(50)not null,
  primary key (idEmploy)
);

insert into employ values (100,'user1','admin');
insert into employ values (200,'user2','president');
insert into employ values (300,'user3','manager');
insert into employ values (400,'user5','line-boss');
insert into employ values (500,'user5','engineer');
