def main():
    for i in range(20):
        print(generate(i) ,  end = " ")   
        i += 1
    
#Recursive function to generate fibonacci sequence.
def generate(num): 
    if num == 0:    
        return num
    
    elif num == 1:    
       return 1

    else:    
        #Recursion
        num1 = generate(num - 1) + generate(num - 2)
        return num1
    
#call the main function.
main()