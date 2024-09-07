# This is a Spring Boot-based quiz application.

## Functionality
### 1. Admin:
Create questions, options, difficulty level, category (Java, Python, etc.), and correct answers.
### 2. User:
View question ID, question title, and options.  
Submit responses.  
View score based on responses.  

## Technical Overview  
### 1. Services:  
- **Question Service**: Returns the list of questions.
- **Quiz Service**: Returns the quiz ID.
### 2. Quiz Creation:
- Questions are selected randomly from the available list.
### 3. Response Handling:
- User responses are compared with correct answers, and the score is displayed.
### 4. Database:
Using H2 database for simplicity.

## Useful Steps to Run the Project
### 1. Access H2 Console:
- Open localhost:8080/h2-console.
- Login credentials:
  - Username: sa
  - Password: password
### 2. Create Questions Table:
- If not present, create the table using:
```
  CREATE TABLE questions (
  id INT,
  category VARCHAR(255),
  difficultylevel VARCHAR(255),
  questiontitle VARCHAR(255),
  option1 VARCHAR(255),
  option2 VARCHAR(255),
  option3 VARCHAR(255),
  option4 VARCHAR(255),
  answer VARCHAR(255)
);
```
### 3. Insert Data:
- Insert sample data:
```
INSERT INTO questions (id, category, difficultylevel, questiontitle, option1, option2, option3, option4, answer) VALUES
(1, 'Java', 'Easy', 'What is the chemical symbol for water?', 'H2O', 'O2', 'CO2', 'H2', 'H2O'),
(2, 'Python', 'Medium', 'What is the value of Pi?', '3.14', '2.71', '1.62', '1.41', '3.14'),
(3, 'Java', 'Hard', 'What is the capital of Australia?', 'Sydney', 'Melbourne', 'Canberra', 'Brisbane', 'Canberra'),
(4, 'Python', 'Easy', 'Who was the first President of the United States?', 'George Washington', 'Thomas Jefferson', 'Abraham Lincoln', 'John Adams', 'George Washington'),
(5, 'Python', 'Medium', 'Who wrote "Romeo and Juliet"?', 'William Shakespeare', 'Charles Dickens', 'Mark Twain', 'Jane Austen', 'William Shakespeare'),
(6, 'Python', 'Hard', 'What planet is known as the Red Planet?', 'Earth', 'Mars', 'Jupiter', 'Saturn', 'Mars'),
(7, 'Java', 'Easy', 'What is 2 + 2?', '3', '4', '5', '6', '4'),
(8, 'Java', 'Medium', 'Which country is the largest by area?', 'China', 'Russia', 'Canada', 'USA', 'Russia'),
(9, 'Java', 'Hard', 'In which year did World War II end?', '1942', '1945', '1948', '1950', '1945'),
(10, 'Python', 'Easy', 'Who is the author of "Harry Potter"?', 'J.K. Rowling', 'J.R.R. Tolkien', 'George R.R. Martin', 'C.S. Lewis', 'J.K. Rowling');
```
### 4. Verify Data:
- Run:
```
SELECT * FROM QUESTIONS;
```

### 5. Create Quiz:
- Use Postman to send a POST request:
```
POST localhost:8080/quiz/create?category=Java&numQ=3&title=JQuiz
```

### 6. Verify Quiz:
- Run:
```
SELECT * FROM QUIZ;
```

### 7. Verify Quiz Questions:
- Run:
```
SELECT * FROM QUIZ_QUESTIONS;
```

### 8. Submit Quiz:
- Use Postman to send a POST request:
```
POST localhost:8080/quiz/submit/1
```
- Body
```
[
  {
    "id": "9",
    "response": "1945"
  },
  {
    "id": "3",
    "response": "Canberra"
  },
  {
    "id": "8",
    "response": "Russia"
  }
]
```
- Replace IDs with those noted in step 7.
- Upon submission, you will see the score.
