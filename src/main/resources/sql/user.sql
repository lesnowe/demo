drop table if exists T_USER;
create table if not exists T_USER
(
    id bigint unique NOT NULL,
    username varchar(20) NOT NULL,
    address varchar(50),
    phonenumber varchar(11) NOT NULL
);

insert into T_USER values (1,"snowlee","NanJin","13675125441");
insert into T_USER values (2,"fish","NanJin","13675125441");
