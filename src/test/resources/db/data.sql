--test data
insert into products ( productid, name, brand, description, productcode, createdon) values ( 1,'McCormick Oregano', 'McCormick', 'Oregano by McCormick is good for your health',123456789123, '2019-10-23 17:40:27');
insert into reviews(reviewid, reviewer, rating, title, productid, comment, reviewdate) values (1, 'Carlos A.', 5, 'A must buy', 1, 'You will never taste oregano like this one', '2019-10-23 17:40:27');
insert into comments (commentid, reviewid, text, createdon) values (1, 1, 'This is fascinating', '2019-10-23 17:40:27');