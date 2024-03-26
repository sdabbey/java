DECLARE index_numbers, midsem_scores, exam_scores, final_scores, grades as ARRAY
DECLARE class_size, average_score, total_scores, Afr, Bfr, Cfr, Dfr, Efr, Ffr as INTEGERS

class_size = INPUT("Enter Class Size)
total_scores = 0;
min = Double.MAX_VALUE
max = Double.MIN_VALUE

Afr=Bfr=Cfr=Dfr=Efr=Ffr=0

FOR i=0 TO class_size STEP 1 
    index_numbers[i] = INPUT("Enter the Student Index Number")
    midsem_scores[i] = INPUT("Enter the Student Mid-Semester Exams")
    exam_scores[i] = INPUT("Enter the Student Exam Score")
    
    scaled_midsem = 0.3 * midsem_scores[i]
    scaled_exam = 0.7 * exam_scores[i]
    
    final_scores[i] = scaled_midsem + scaled_exam
    total_scores += final_scores[i]
    
    IF final_scores[i] >= 70 THEN 
    	grades[i] = 'A'
    ELSE IF final_scores[i] >=60 THEN
    	grades[i] = 'B'
    ELSE IF final_scores[i] >= 55 THEN 
    	grades[i] = 'C'
    ELSE IF final_scores[i] >= 50 THEN 
    	grades[i] = 'D'
    ELSE IF final_scores[i] >= 40 THEN
    	grades[i] = 'E'
    ELSE 
    	grades[i] = 'F'
    ENDIF
    
    //Finding Minimum and Maximum scores
    IF final_scores[i] < min THEN 
    	min = final_scores[i]
    ENDIF
    
    IF final_scores[i] > max THEN 
    	max = final_scores[i]
    ENDIF
    
    //Grade Frequency Calculation
    IF grades[i] == 'A' THEN
    	Afr += 1
    ELSE IF grades[i] == 'B' THEN
    	Bfr += 1
    ELSE IF grades[i] == 'C' THEN
    	Cfr += 1
    ELSE IF grades[i] == 'D' THEN
    	Dfr += 1
    ELSE IF grades[i] == 'E' THEN
    	Efr += 1
    ELSE
    	Ffr += 1
    ENDIF
ENDFOR

//Average Score Calculation
average_score = total_scores / class_size;

PRINT"Index No." + "Final Score" + "Grade"

FOR k = 0 TO class_size STEP 1
    PRINT index_numbers[k], final_score[k], grades[k]
ENDFOR

PRINT"The average score is ", average_score
PRINT"The maximum score is ", max
PRINT"The minimum score is ", min

PRINT"Grades with Frequencies"
PRINT"Grade A had frequency of ", Afr
PRINT"Grade B had frequency of ", Bfr
PRINT"Grade C had frequency of ", Cfr
PRINT"Grade D had frequency of ", Dfr
PRINT"Grade E had frequency of ", Efr
PRINT"Grade F had frequency of ", Ffr

END

    
    
