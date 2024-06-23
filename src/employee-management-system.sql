create database employeemanagement;
use employeemanagement;
create table login(username varchar(20), password varchar(20));
select * from login;
insert into login values('cs123456', '123456789');
select * from login;

CREATE TABLE employee (
    name VARCHAR(40),
    fname VARCHAR(40),
    dob VARCHAR(40),
    phone VARCHAR(40),
    email VARCHAR(40),
    address VARCHAR(40),
    cnic VARCHAR(40),
    salary VARCHAR(40),
    education VARCHAR(40),
    designation VARCHAR(40),
    empID VARCHAR(40)
);

INSERT INTO employee (name, fname, dob, phone, email, address, cnic, salary, education, designation, empID) VALUES
('Ali', 'Ahmed', '1990-05-12', '03001234567', 'ali.ahmed@example.com', 'Karachi', '4301234567890', '75000', 'MBA', 'Manager', '123456'),
('Sara', 'Tariq', '1985-08-24', '03009876543', 'sara.tariq@example.com', 'Lahore', '4300987654321', '82000', 'BSCS', 'Software Engineer', '234567'),
('Hassan', 'Usman', '1992-01-15', '03007654321', 'hassan.usman@example.com', 'Islamabad', '4301765432109', '68000', 'BBA', 'HR Specialist', '345678'),
('Fatima', 'Khalid', '1988-11-07', '03004567890', 'fatima.khalid@example.com', 'Rawalpindi', '4302456789012', '90000', 'M.TECH', 'Project Manager', '456789'),
('Umar', 'Naeem', '1995-03-30', '03005678901', 'umar.naeem@example.com', 'Faisalabad', '4303567890123', '65000', 'B.COM', 'Accountant', '567890'),
('Ayesha', 'Rashid', '1993-07-19', '03002345678', 'ayesha.rashid@example.com', 'Multan', '4304234567890', '72000', 'MA', 'Marketing Manager', '678901'),
('Bilal', 'Farooq', '1989-12-10', '03003456789', 'bilal.farooq@example.com', 'Quetta', '4305345678901', '77000', 'BSSE', 'System Analyst', '789012'),
('Zainab', 'Sohail', '1991-09-25', '03006543210', 'zainab.sohail@example.com', 'Peshawar', '4306654321098', '88000', 'PHD', 'Research Scientist', '890123'),
('Kamran', 'Yasir', '1987-06-14', '03007654321', 'kamran.yasir@example.com', 'Gujranwala', '4307765432109', '81000', 'MSC', 'Data Analyst', '901234'),
('Rabia', 'Shahid', '1994-02-21', '03008765432', 'rabia.shahid@example.com', 'Sialkot', '4308876543210', '93000', 'ACCA', 'Financial Analyst', '012345');
('Asim', 'Akram', '1986-04-11', '03004561234', 'asim.akram@example.com', 'Hyderabad', '4304561234567', '72000', 'BCA', 'Network Engineer', '112233'),
('Nida', 'Javed', '1990-12-05', '03007891234', 'nida.javed@example.com', 'Sukkur', '4307891234567', '67000', 'MBA', 'Operations Manager', '223344'),
('Rehan', 'Hussain', '1989-07-23', '03005678912', 'rehan.hussain@example.com', 'Abbottabad', '4305678912345', '81000', 'BSDS', 'Data Scientist', '334455'),
('Ammar', 'Ibrahim', '1993-09-10', '03006547891', 'ammar.ibrahim@example.com', 'Bahawalpur', '4306547891234', '65000', 'B.COM', 'Sales Executive', '445566'),
('Maham', 'Asad', '1992-11-17', '03003456780', 'maham.asad@example.com', 'Sargodha', '4303456789012', '89000', 'MSC', 'Research Analyst', '556677');


select * from employee;