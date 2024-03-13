DECLARE studentDetail, studentRating, holidayRatingFrequency as MAP and initialize as empty maps.
WHILE True THEN
	OUTPUT "Enter student's name: "
	INPUT name
	
	OUTPUT "Enter student's phone number: "
	INPUT phone_number
	
	DECLARE rating as INTEGER
	OUTPUT "Enter student's holiday destination rating(1-7): "
	INPUT rating
	
	IF rating < 1 or rating > 7 THEN
		OUTPUT "Error: Rating out of range! Please enter a rating between 1 and 7"
	ENDIF
	
	studentDetail.put(name, phone_number)
	studentRating.put(phone_number, rating)
	holidayRatingFrequency.put(rating, increment rating by 1)
	
	
	OUTPUT "Enter any key to continue (or 'z' to finish): "
	DECLARE prompt as String
	INPUT prompt
	
	IF prompt=="z" THEN 
		break;
	ENDIF
ENDWHILE

OUTPUT "Total number of students entered: ", studentDetail.size

OUTPUT "Frequency of occurrence of each holiday destination rating:"
FOR rating in holidayRatingFrequency THEN
	OUTPUT "Rating", rating + ": " + holidayRatingFrequency(rating) + " times"
ENDFOR

OUTPUT "Holiday destination ratings in descending order: "
holidayRatingFrequency.sort(descending order)

WHILE True THEN
	OUTPUT "Enter student's name to display details (or 'E' to exit): "
	DECLARE queryName as String
	INPUT queryName
	
	FOR entry in studentDetail
		IF entry == queryName THEN
			OUTPUT entry, entry.phone_number, entry.studentrating
		ENDIF
	ENDFOR
	
	IF queryName == "e" THEN
		break;
	ENDIF
ENDWHILE
STOP
