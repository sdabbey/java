# Saving User Data
- Data stored in variables or arrays are temporal just as data stored in RAM
- Data is lost when a local variable goes out of scope or when program terminates
- For long term retention of data even after program termination, computers uses files to store the data
- Computers store files on secondary devices such as hard disk drives, optical drives, flash drives, magnetic tapes etc.
- Data stored in files are referred to as **Pesistent Data**[Meaning the data exist even after program termination]
    
### Working with Streams
- Java view each file as a sequencial stream of bytes
- Java program reads sequences of bytes from an input stream and write sequences of bytes to an the output stream.
- When a java program begins execution it creates 3 stream objects: *System.in*, *System.out* and *System.err*
- Each stream object functionality can be redirected.

### Handling Files with Java
- Java defines input streams and output streams
- Java contains a package named **java.io** that is designed to handle file input and output operations
- Java program performs file processing using classes from the **java.io** package.
- The package can be made available for a java program using **[java.io.*]**
    - Classes found within the java.io.*:
        - File input stream [*For reading file based input from a file*]
        - Byte input stream [*For reading byte based input from a file*]
        - File output stream [*For reading file based output*]
        - Abstract reader - [*For reading character based input from a file*]
        - File writer - [*For writing file based output*]

### Creating a file object in java
- File object is created in java using the file object as follows:
    //Instantiate the File class and import the file
    **File inf = new File("file.extension")**
    //Pass the inf as an argument to the FileReader class instance
    **FileReader fr = new FileReader(inf)**

    //To enhance read operation, a BufferedReader is used **[Buffering is an I/O performance enhancement technique]**.
    **BufferedREader **br = new BufferedReader(fr);**
        String line = "";
        while((line = br.readLine()) != null){
        System.out.println(line);
    **}**

    //Buffer is closed after usage.
    **br.close();**

- The file class has methods including the following: 
    - **exists(): Example; **inf.exists()**[ Note: inf is a pointer to a file.] - This is to check that the file that is loaded exists.

    - **getName()**: Returns name of file.
    