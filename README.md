Core Java:
---------
oops concepts
clasess
object
data types
variables
opreaorators
exception handling
control statements
iterative statements

language.--java/c/c++/csharp

Sysout("Hello!");

syntax

-----------------------
u need some softwares

eclipse(IDE)/intellij
notepad/notepad ++/vs code



---------------------

console

input
output

------------

javac files
java file


create a clsss----.java
sve the clase-----x.java
compile the class-----
run the class


---------------------------

eclipse
java software(jdk 8)

----------------------


public class classname{

main(String[] abc){

Sysout("Hello Worls");
}

}




//access speceifier        //keyword          //name of the classname
public                     class              HelloWorldProgram{

body of the class
//variables
//method
public static void main(String[] abc){

Sysout("Hello Worls");
}

}








public class HelloWorldProgram1{

main(String[] abc){

Sysout("Hello Worls1");
}

}



predefinded
class catch try  throws thorow  

user definded




methods:
//method
//access speceifier      //access modifier      //return type             //name of the method    //variables/arguments
public                   static                   void                    main                   (String[] abc){

Sysout("Hello Worls");
}

//access speceifier      //access modifier      //return type             //name of the method    //variables/arguments
public                   static                   void                    main                   (String[] ards){

Sysout("Hello Worls");
}


//access speceifier      //access modifier      //return type             //name of the method    //variables/arguments
public                   static                   void                    main                   (String[] nvbdjk){

Sysout("Hello Worls");
}



static 
non static




public static void add(1,4){
Sysou("5");
}

add(1,4);//triggering///calling//invoking//useing the method
//5 will be printeed on the consoles




public static to the value whatever we want ot retunr  add(1,4){

}

public static int  add(1,4){

}

public static float  add(1,4){

}

public static String  add(1,4){

}


public static String  add(){

}


add(1,4);



--------------

public class HelloWorldProgram{


public static void man( String[] abs){
System.ot.println("Hello World");

}





}


packages:

syntax for package

com.companyname.projectname.xxxx

com.meta.facebok.posts;
com.meta.facebok.xyz;


facebook
  -posts
   -
   -
  -messenger
  

Data types:

numeric dattypes
int/float/double/short/long
alphanumeric datatypes
String/char
boolena type
true/false

user definded datatypes

ex:

int/float/double/short/long

String

char

boolean

details of a student

Name
Sid
Dept
Address
Sring x = "d werewr ewrew r3	2 r32	 r32 ee1 "


UserDefinded Object

Student{

Name--Sting
Sid-int
Dept-string
Address-string



}



Student.name

Arrays:

marks:
100
25
67

int

int [3]={100,25,67}

Student [2]=={}

Data formats

xml
text
json
html


student :
name
sid
add
dep

{

"name":"cAfqwwd	q",
"sid":"fef	"



}


[
{

"name":"cAfqwwd	q",
"sid":"fef	"



},
{

"name":"cAfqfwfwwwd	q",
"sid":"fefefefw	"



}




]



variable declaration
variable initilization


age =19

datatype variablename;
int        age;

int        age=19;

voting app

age>=18 then eligible for voting

int eligibleAge=18;
int person1Age;
int person1Age = 19

person1Age>=18
19>=18



1
2
3
4
5
6
7
89

int
float
double
short/
long
boolean
String
char



types of variables


variables===members===properties

inside the class

{



}



4 differnt type of variables
1.local variables
2.public variables/global variables
3.static variables
4.concrete/non static variables.


public class VariablesDemo{

int age = 10;
float weight = 65.7;
boolean gender=true;
String address = "Aknivjdlf";


main(Sinr vdfvd){

Sysout("cikciksjcj");
Sysout(age);
Sysout(weight);

Sysout("The value for age is:"+age);



}


}

4 differnt type of variables
1.local variables
2.public variables/global variables
3.static variables
4.concrete/non static variables.


datatype variablename;

datatype variablename=value;

in case if variables are declared/initialized without static keyword are treated a non static /instance/concrete variables.

in case if variables are declared/initialized with static keyword are treated as static  variables.

public class VariablesDemo{

int age = 100;//ns

float weight = 65.6;//ns


main(){


String name ="Anthony";//ns



}


String address ="Hyderabad";//ns


}




public class VariablesDemo{

static int age = 100;//s

static float weight = 65.6;//s


main(){


String name ="Anthony";//ns



}


String address ="Hyderabad";//ns


}



methods:
--------
static methods
non static methods
final methods
abstract method

m-mandatory
nm-not mandatory(optional)

nm      nm     m    m    nm    
public static void main(args){

nm
}


void wish(){

}

int  addition(int a,int b){

return a+b;

}


int  sub(int a,int b){

return a-b;

}


int  seytdruyiguhijokplpub(int a,int b){

ine c = a+b;

return 'A';

}

float  seytdruyiguhijokplpub(int a,int b){

return 0.9;

}

char  seytdruyiguhijokplpub(int a,int b){

return 'a';

}

String  seytdruyiguhijokplpub(int a,int b){

return "Anthony";

}



boolean  seytdruyiguhijokplpub(int a,int b){

return true;

}



access specifiers:


inheritance:
-----------


father         child

properties     able to get them directly



extends


parent
;
;
extends
;
;child



Student



SudentDetails extends Students


Students extdns SudentDetails


RBIBank{

minbal(){
100;
}

noOfbracnhes(){
}




}


SBIBank extends RBIBank{



typesOFAccounts(){

}

typesOfCardsProvided(){



}



main(){

1000;

@voeride
minbal(){


}

}




}



HDFCBank extends RBIBank{



typesOFAccounts(){

}

typesOfCardsProvided(){



}




}


polymorphism:
------------

2 conecpts

run time polymorphism(Method overiding)
compile time polymorphism(method overloading)


run time polymorphism(Method overiding):
-----------------------------------



compile time polymorphism(method overloading):
---------------------------------------------



int addition(int a,int b){

retunn a+b;


}




int addition(int a,int b,int c){

retunn a+b+c;


}


int addition(int a,int b,int c,float d){

retunn a+b+c+d;


}

adition(1,2);
adition(1,2,4);
adition(1,2,3,4);


Users

saveAddress()

Admin
saveAdmin()

Employeee


Adresss



Save(User)


--------------

Interfaces:
abstract mthids

CrudReoitory{
save();
delete();
update();
read()

}


Table tries t impelet the bsic 4 methods.

Table implements CrudReoitory{
save(){
}
delete(){}
update(){}
read(){
}


}

x
public void saveStudentDetaikls()
{


ffqff
}

y
public void saveStudentDetaikls()
{

dweefewf

}


Main
public void saveStudentDetaikls(int a,float b);



X implemts Main
saveStudentDetaikls()

Y implemts Main
saveStudentDetaikls()


operators:
-----------

arthimetic
+
_
/
*
%
relationl opertors
<
>
<=
>=
==
!=

1,2,3,4
1>2 && 1>3 && 1>4----F

1>2 ||  1>3 && 1>4----F

then i can say 1 is bigger
assignment peator
==

logical operators:
truth tables

TT T


FF F


&&
||

ternry operator
1>2?print 1 is smaller:2 is bigger


Control statements:
--------------------

if else

if(condition){

}else{

}


if(condition)
fwefef;
yjggygyuyi
hguhi
jhihi

else
fwefqef;


if(condition1){

}else{

}


if(condition2){

}else{

}



if(condition3){

}else{

}



switch

nested if else

if(Confition1){

}else if(Confition2){
}else if(Confition2){
}else if(Confition2){
}else if(Confition2){

}else if(Confition2){
}else if(Confition2){
}-
-
-
else{

}


switch(String  wm){

case 'a':jdbjwdajhhi;
break;
case 2:jdbjwdajhhi;
break;
case 3:jdbjwdajhhi;
break;
case "tv":jdbjwdajhhi;
break;

default :jdbjwdajhhi;




}

iterative statements:
---------------------
for
foreach

while

do while


for(initilization;  condition; increment / decremnt){

}


public clss Demo{

main(){}


Sysout(1)
Sysout(1)
Sysout(1)
Sysout(1)
Sysout(1)
Sysout(1)
Sysout(1)
Sysout(1)
Sysout(1)


}


for(int a=1; a<=10; a++ ){

sysout 

}

for(int a=1; a<=100; a++ ){

sysout 1
2

100

}


for(int a=100; a>=1; a--){

sysout 100
99

100

}


int numbers = {1,2,34,5,6,8};


for(Integer number :numbers){
Sysout(number)

}

while( a>=1){

a++;

}


do{

}while(a>=1)


2*1=2

2+1=2


marks:

int sub1= 100;
int sub2= 100;

int [5] marks;
float [5] marks;
String [10] names;

Students[4] students;

marks = {1,2,3,4,5};

names = {"qwdq","qwdq","qwdq","qwdq","qwdq","qwdq","qwdq","qwdq","qwdq"};

Students{

int age;
string nam;




}

Students Students1 = new Students();
Students.name ="flwfw",
Students.age= 123;


students[0]=Students1;

Students Students2 = new Students();
Students.name ="flwfw",
Students.age= 123;

students[1]=Students2;

students =={
{
Students.name ="flwfw",
Students.age= 123;

},
{
Students.name ="flwfw",
Students.age= 123;
},
{
Students.name ="flwfw",
Students.age= 123;

},
{
Students.name ="flwfw",
Students.age= 123;
}



}

Collections:

List
Set
Map

1,2,3,4,5

List

ArrayList
Vector
LinkedArraylist


=============
Set

Hashset
LinkedHashSet
Treeset

===========

Map

Hashmap
LinkedHashMap
TreeMap


1 2 3 4 5 5

Studnes



list 

1,2,3,4,5,6,7,7-input

1,2,3,4,5,6,7,7-nput

set 

1,2,3,4,5,6,7,7-input

1,2,3,4,5,6,7-nput

Map
key-->value
a--1
a--2
c--3



List-Interface

abstract methods
add
remove
get
removall
addall

List<T> numbers = new ArrayList<T>();
numbers.

Set<T> numbers = new HashSet<T>();
numbers.

List

list of names.


List<String> names = new Arraylist<String>();
names.add("yguhijo");
names.add("fefwefw");
names.add("yguhdsdsijo");
names.add("fedsdsfwefw");


List<Integer> numbers = new Arraylist<Integer>();
numbers.add(1);
numbers.add(13);
numbers.add(14);
numbers.add(15);
numbers.add(1);
numbers.add(1);numbers.add(1);
numbers.add(1);


List<Float> numbers = new Arraylist<Float>();

numbers.add(1.0);
numbers.add(13.0);
numbers.add(14.0);
numbers.add(15.0);

List<T> ref = new ArrayList<T>();

List<Employee> employessList = new ArrayList<Employee>();

Employee{
int empId;--setter method--getter method
String name;
Strng address;
}


Employee emp1 = new Employee();
emp1.setName("fwfwqd");
emp1.setempId(123);
emp1.setAddress("wtserdyfyghunjk");




employessList.add(emp1);

Employee emp2 = new Employee();
emp2.setName("wdwf");
emp2.setempId(1234);
emp2.setAddress("efwfqwrfr");

employessList.add(emp2);


Employee emp22 = new Employee();
emp22.setName("wdwf");
emp22.setempId(1234);
emp22.setAddress("efwfqwrfr");

employessList.add(emp22);


for (intlization; condtion; incrment/decrement)

for(int i=1; i<=employessList.size;i++)



for(Employee emp:employessList){
emp.getname
.geId'
.getAddress

}

for(Integer number : numbers){
number

}

Exception Handling:
-------------------
try

catch

throw

throws

finally



public class ExceptionExample {

	public static void main(String[] args) {

		System.out.println(2 / 1);
		
		try{
		System.out.println(1 / 0);
		}catch(ArithmeticException ex){
		System.out.println("there is some issue with the code"+ex);
		}catch(ArithmeticException ex){
		System.out.println("there is some issue with the code"+ex);
		}
		catch(ArithmeticException ex){
		System.out.println("there is some issue with the code"+ex);
		}
		catch(ArithmeticException ex){
		System.out.println("there is some issue with the code"+ex);
		}
		
		System.out.println(1 / 1);
	}
	
	run time exceptions 
	compile time exceptions
	
	
	-------------
	un checked exceptions
	checked exceptions
	

}


try

catch

throw

throws

------

finally


class{


main(){

try{

sysout(1/0)//possiblity of getting excepton

}catch(Exception ex){
ex.printstacktracke();
}



sysout("Thanks you");


}
}


-----------

class{


main(){



sysout(1/0)//possiblity of getting excepton



finally{
sysout("Thanks you");
}




}
}




----------------

catch


Advanced topics.


toools
maven

goals


clean

install


Demo.java(making some chnages)
Demo1.Java


maven install

Demo.class
Demo1.class


maven clean 
maven install

Demo.class
Demo1.class

dependencies(libraries/jars/third party classses.)

pom.xml

maven bulild

goals: clean install








Applicaton servers


tomcat server




frameworks
spring boot
rest api/restfull web services


database
any db--mysql
hibernate/jpa


MODEL(DB Operation) VIEW(User Interface) CONTROLLER(driving the functionality)


Project
-src/main/java--java code
-src/test/java--contins the test cases for the java code.
-src/test/resources
-src/main/resources-resurces
-maven-dependencies
-pom.xml



username
paswd
connection url
dabase name

username
paswd
connection url
dabase name

username
paswd
connection url
dabase name

username
paswd
connection url
dabase name



addition(nt a,int b){

}


Junits



EMS:



EMS

Emploess

Departments

ABS

XYZ

























































  






























