# EncontaInvoice

This small project estimates the amount of invoices of a client / user given their id and a range of dates (start date and end date).

To run this project execute this command in the root project directory
```
javac -d classes -cp classes  src/main/java/com/mycompany/encontafacturas/*.java
```

then run this command
```
java -cp classes com.mycompany.encontafacturas.Main "2017-01-01" "2017-03-01" "4e25ce61-e6e2-457a-89f7-116404990967" "http://34.209.24.195/facturas"
```
Optional
You can download and install NetBeans IDE 8.2 if you want to run all the test.
```
https://netbeans.org/downloads/
```

Parameters:

1- Start Date

2- Finish Date

3- User/Client id

4- Server's address

