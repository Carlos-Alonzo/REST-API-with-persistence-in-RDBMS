-- write sql to create member table
create table products (productid int auto_increment,
                                                        name varchar(30) not null,
                                                        brand varchar(30) not null,
                                                        description varchar(1000) not null,
                                                        createdon timestamp not null,
                                                        productcode varchar(14) not null,
                                                        constraint primary key (productid));

create table reviews (reviewid int auto_increment,
                                                        reviewer varchar(30) not null,
                                                        rating int not null,
                                                        title varchar(60) not null,
                                                        reviewdate timestamp not null,
                                                        comment varchar(1000) not null,
                                                        constraint primary key (reviewid));