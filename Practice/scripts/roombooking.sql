create table room(
  room_id BIGINT AUTO_INCREMENT PRIMARY KEY, 
  name varchar(255), 
  description varchar(255));
	
create table amenity(
  amenity_id BIGINT NOT NULL AUTO_INCREMENT,
  name_of_amenity varchar(50),
  description varchar(255),
  CONSTRAINT u_amenity_id_name UNIQUE KEY (amenity_id,name_of_amenity),
  PRIMARY KEY(amenity_id));
	
insert into amenity(
  `amenity_id`,`name_of_amenity`,`description`) 
  VALUES (1,'AC','Air Conditioner');
	
insert into amenity(
 `amenity_id`,`name_of_amenity`,`description`)
  VALUES (2,'White Board','Easily erasable white board');
	
insert into amenity(
  `amenity_id`,`name_of_amenity`,`description`)
  VALUES (3,'Projector','Projector');
	
insert into amenity(
  `amenity_id`,`name_of_amenity`,`description`)
  VALUES (4,'Computer','Computer');
	
CREATE table room_amenity_link(
  id BIGINT NOT NULL AUTO_INCREMENT,
  room_id BIGINT NOT NULL,
  amenity_id BIGINT NOT NULL,
  PRIMARY KEY(id),
  CONSTRAINT u_room_id_amenity_id UNIQUE KEY(room_id,amenity_id),
  CONSTRAINT `room_amenity_fk1` FOREIGN KEY(`room_id`) REFERENCES `room` (`room_id`),
  CONSTRAINT `room_amenity_fk2` FOREIGN KEY (`amenity_id`) REFERENCES `amenity`(`amenity_id`));

CREATE TABLE room_booking(
  booking_id BIGINT AUTO_INCREMENT PRIMARY KEY,
  employee_id BIGINT,
  booking_time BIGINT,
  booked_from BIGINT,
  booked_till BIGINT,
  room_id BIGINT, 
  CONSTRAINT `employee_booking_fk` FOREIGN KEY (`employee_id`) REFERENCES `employee`(`employee_id`),
  CONSTRAINT `room_booking_fk` FOREIGN KEY(`room_id`) REFERENCES `room`(`room_id`)) 
	
	
CREATE TABLE `employee` (
  `employee_id` bigint(20) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `birth_date` datetime DEFAULT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `current_address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `emergency_contact_number` bigint(20) DEFAULT NULL,
  `emergency_contact_person` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `four_wheeler_number` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `joining_date` datetime DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `middle_name` varchar(255) DEFAULT NULL,
  `on_board_date` datetime DEFAULT NULL,
  `pan_number` varchar(255) DEFAULT NULL,
  `passport_number` varchar(255) DEFAULT NULL,
  `passport_valid_date` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `perment_address` varchar(255) DEFAULT NULL,
  `primary_contact_number` bigint(20) DEFAULT NULL,
  `probation` int(11) DEFAULT NULL,
  `release_date` datetime DEFAULT NULL,
  `role_id` int(11) NOT NULL,
  `secondary_contact_number` bigint(20) DEFAULT NULL,
  `two_wheeler_number` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `employee` (`employee_id`, `is_active`, `birth_date`, `blood_group`, `code`, `current_address`,
  `email`, `emergency_contact_number`, `emergency_contact_person`, `first_name`, `four_wheeler_number`, 
  `gender`, `joining_date`, `last_name`, `middle_name`, `on_board_date`, `pan_number`, `passport_number`,
  `passport_valid_date`, `password`, `perment_address`, `primary_contact_number`, `probation`, `release_date`
  , `role_id`, `secondary_contact_number`, `two_wheeler_number`, `user_name`) VALUES
  (95, b'1', '2018-07-11 00:00:00', 'ab', 'ab', 'ab', 'baaaae', 125111, 'aeeaaab', 'bakka', 'ab', 'baaaae', '2018-07-19 00:00:00', 'baaae', 'baeeaa', '2018-07-20 00:00:00', 'aebaaa', 'eab', '2018-07-19 00:00:00', 'baaaae', 'ab', 445454152, 25, '2018-07-12 00:00:00', 1, 4476562451, 'ab', 'sjdfhj'),
  (96, b'1', '2018-07-11 00:00:00', 'ab', 'ab', 'ab', 'baaaae', 125111, 'aeeaaab', 'bakka', 'ab', 'baaaae', '2018-07-19 00:00:00', 'baaae', 'baeeaa', '2018-07-20 00:00:00', 'aebaaa', 'eab', '2018-07-19 00:00:00', 'baaaae', 'ab', 445454152, 25, '2018-07-12 00:00:00', 1, 4476562451, 'ab', 'sjdfhj'),
  (97, b'1', '2018-07-11 00:00:00', 'ab', 'ab', 'ab', 'baaaae', 125111, 'aeeaaab', 'bakka', 'ab', 'baaaae', '2018-07-19 00:00:00', 'baaae', 'baeeaa', '2018-07-20 00:00:00', 'aebaaa', 'eab', '2018-07-19 00:00:00', 'baaaae', 'ab', 445454152, 25, '2018-07-12 00:00:00', 1, 4476562451, 'ab', 'sjdfhj');


ALTER TABLE `employee`
  ADD PRIMARY KEY (`employee_id`);

ALTER TABLE `employee`
  MODIFY `employee_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=98;