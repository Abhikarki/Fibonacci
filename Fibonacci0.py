n1 = 0
n2 = 1

#print 0 and 1 in the beginning.
#end = " " appends space instead of new line.	    		    
print(n1 , n2 , end = " ")  
		 
i = 0
#Loop to print the fibonacci sequence
while i < 18:
    n3 = n1 + n2   
    #end = " " appends space instead of new line.
    print(n3, end = " ")
    n1 = n2
    n2 = n3
    i += 1     