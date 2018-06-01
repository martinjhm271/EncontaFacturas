# EncontaInvoice
Run this command in the root project directory
javac -d classes -cp classes  src/main/java/com/mycompany/encontafacturas/*.java

then run this command
java -cp classes com.mycompany.encontafacturas.Main "2017-01-01" "2017-03-01" "4e25ce61-e6e2-457a-89f7-116404990967" "http://34.209.24.195/facturas"

Parameters:
1- Start Date
2- Finish Date
3- User/Client id
4- Server's address
