DECLARE Student_Detail, Individual_Rating, Rating_Frequency as MAP and initialize as empty maps.
WHILE True THEN
	OUTPUT "Enter student's name: "
	INPUT name
	
	OUTPUT "Enter student's phone number: "
	INPUT phonenumber
	
	DECLARE rating as INTEGER
	OUTPUT "Enter student's holiday destination rating(1-7): "
	INPUT rating
	
	IF rating < 1 or rating > 7 THEN
		OUTPUT "Error: Rating out of range! Please enter a rating between 1 and 7"
	ENDIF
	
	Student_Detail.put(name, phonenumber)
	Individual_Rating.put(phonenumber, rating)
	Rating_Frequency.put(rating, increment rating by 1)
	
	
	OUTPUT "Enter any key to continue (or 'z' to finish): "
	DECLARE prompt as String
	INPUT prompt
	
	IF prompt=="z" THEN 
		break;
	ENDIF
ENDWHILE

OUTPUT "Total number of students entered: ", Student_Detail.size

OUTPUT "Frequency of occurrence of each holiday destination rating:"
FOR rating in Rating_Frequency THEN
	OUTPUT "Rating", rating + ": " + Rating_Frequency(rating) + " times"
ENDFOR

OUTPUT "Holiday destination ratings in descending order: "
Rating_Frequency.sort(descending order)

WHILE True THEN
	OUTPUT "Enter student's name to display details (or 'E' to exit): "
	DECLARE queryName as String
	INPUT queryName
	
	FOR entry in Student_Detail
		IF entry == queryName THEN
			OUTPUT entry, entry.phonenumber, entry.Individual_Rating
		ENDIF
	ENDFOR
	
	IF queryName == "e" THEN
		break;
	ENDIF
ENDWHILE
STOP
