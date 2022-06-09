# JavaLabs
Repository for Java labs 2-7 on the course **«Internet of Things»** by Lviv Polytehnic National University


# The task was:
**Department of Household Chemicals.**

Implement the hierarchy of home cleaning classes available in the household chemicals department.
Implement the ability to choose the necessary tools for cleaning the apartment.
Implement the ability to sort found goods by two types of parameters _(optional, implemented as two separate methods)_.
The implementation of sorting should provide the ability to sort both in descending and ascending order.

# **Laboratory requirements**
**Lab2**

  - Implement the hierarchy of classes for the task of laboratory №2 (section Winter School)
  - When writing a program, you need to use the arrangements for the design of the java code convention.
  - Classes need to be properly divided into packages.
  - Working with the console or console menu should be minimal.
  - Important: only the class hierarchy needs to be implemented, the search code for items in lists or collections is not included in the 2nd work
  - You should also create objects of the classes you have implemented in a separate Main class, which will contain the main method
  - It is necessary to add the surname in the table to the task 2 a circle of the chosen variant (it is necessary to choose independently)
  - If there are no more free options in the document - you should write to the teacher and get a version from him

**Lab3**

You need to create a class - Manager that will contain logic (example for option 1):
- Realize the search for goods that can be bought for a girl in the autumn period and realize the possibility of sorting the found goods:
   - at a price
   - by size
- The implementation of sorting should provide the ability to sort both in descending and ascending order
- Use the built-in sorting methods available in Java to sort
- Sorting should be implemented in a **separate method**
- The code does not contain static methods / attributes. Only one static method is allowed - void
- Code must use enum type _(if necessary)_

**Lab4** _(Лінь перекладати)_

Перетворити проект з _кодом 2-3 роботи_ таким чином, щоб його збірку можна було виконувати **з-за допомогою  maven**. 
При цьому варто зробити команду merge попередніх робіт в master
Важливо: збірку проекту слід виконувати з консолі командою mvn clean package

Згенерувати pom.xml можна з використанням команди maven _(слід виконувати з консолі)_:
**mvn archetype:generate -DgroupId=ua.lviv.iot -DartifactId=work -Dversion=1.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false**

