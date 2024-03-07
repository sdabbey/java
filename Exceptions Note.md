# Exceptions
- How we deal with errors in a program
- Throwable class:  classes that deal with errors
    *Error class*:(Runtime Error, Syntax Errors, Logical Errors)
        1. Runtime Error: Fatal errors **[!Developer has no control over]**



    *Exception class*:(Errors that the developer must write code for.)
        - Runtime Exceptions, I/O Exceptions, SQL Exceptions
        - 2 categories of exceptions: [Check Exceptions, Uncheck Exceptions]
            - Unchecked: not checked during compilations
            - Checked: Checked by compiler during compilations
        1. Runtime Exceptions[Unchecked]: 
            **ArrayIndexOutOfBoundsException**
            **InputMismatchException**
            **NumberFormatException**
            **ArithmeticException**
            **IllegalAccessException**
            --
        2. I/0 Exceptions[Checked]:
            **FileNotFound**
            **EndofFIleException(EOF)**
            **SocketException**

- Java provides 5 Keywords for dealing with Exceptions
    - *Try*, *Catch*, *Throw*, *Throws* and *Finally*
    - These keywords form Interrelated Subsystem.
    - *Finally* block contains code you show whether or not an error occurs.
    - 