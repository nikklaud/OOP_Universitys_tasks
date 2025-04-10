-- Создание таблицы факультетов (departments)
CREATE TABLE dept (
    dept_id VARCHAR(10) PRIMARY KEY,
    dept_name VARCHAR(100) NOT NULL
);

-- Создание таблицы курсов
CREATE TABLE courses (
    course_id VARCHAR(10) PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL,
    dept_id VARCHAR(10),
    FOREIGN KEY (dept_id) REFERENCES dept(dept_id)
);

-- Создание таблицы студентов
CREATE TABLE students (
    student_id VARCHAR(15) PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    dept_id VARCHAR(10),
    FOREIGN KEY (dept_id) REFERENCES dept(dept_id)
);

-- Создание таблицы транскриптов (оценки студентов по курсам)
CREATE TABLE transcript (
    id SERIAL PRIMARY KEY,
    student_id VARCHAR(15),
    course_id VARCHAR(10),
    grade VARCHAR(2),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);
