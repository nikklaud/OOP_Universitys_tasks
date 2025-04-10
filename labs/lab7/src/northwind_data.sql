-- Данные для департаментов
INSERT INTO dept (dept_id, dept_name) VALUES
('D01', 'Computer Science'),
('D02', 'Mathematics'),
('D03', 'Physics');

-- Данные для курсов
INSERT INTO courses (course_id, course_name, dept_id) VALUES
('C01', 'Java Programming', 'D01'),
('C02', 'Algorithms', 'D01'),
('C03', 'Calculus', 'D02'),
('C04', 'Linear Algebra', 'D02'),
('C05', 'Quantum Mechanics', 'D03');

-- Данные для студентов
INSERT INTO students (student_id, student_name, dept_id) VALUES
('123456789', 'Oliver Jones', 'D01'),
('987654321', 'Emma Brown', 'D02'),
('111222333', 'Liam Smith', 'D01'),
('444555666', 'Ava Johnson', 'D03'),
('777888999', 'Noah Davis', 'D01');

-- Данные для транскрипта Oliver Jones
INSERT INTO transcript (student_id, course_id, grade) VALUES
('123456789', 'C01', 'A'),
('123456789', 'C02', 'B'),
('123456789', 'C03', 'A');
