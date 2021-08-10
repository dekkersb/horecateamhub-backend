//admins
INSERT INTO users (username, password, enabled, authority) VALUES ('bart@boterkapel', '$2a$12$iEsx6VNPH0YbdqdfmzCz4OMB2kJJ4Z8tWjCgHkE1VwzrK/thz5ys6', true, 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('bart@boterkapel', 'ROLE_ADMIN');

INSERT INTO users (username, password, enabled, authority) VALUES ('marijn@boterkapel', '$2a$12$wF0sFEo7CQaXeY4tJXiIQu8J2OQ/nsaqVxUFdiHhGPMHU.klTlYfu', true, 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('marijn@boterkapel', 'ROLE_ADMIN');