## Java 12

### String Utility Methods
indent() adjusts the indentation of each line based on the integer parameter. 
If the parameter is greater than zero, new spaces will be inserted at the beginning of each line. 
On the other hand, if the parameter is less than zero, it removes spaces from the begging of each line. 
If a given line does not contain sufficient white space, then all leading white space characters are removed.

new method is transform(). It accepts a single argument function as a parameter that will be applied to the string.

### File Mismatch Methods
mismatch(Path1,Path2)
The method is used to compare two files and find the position of the first mismatched byte in their contents.

### Switch expressions
Preview Feature
Now Switch can be used as either a statement or an expression.
`typeOfDay = switch (dayOfWeek) {
     case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
     case SATURDAY, SUNDAY -> "Day Off";
 };`
or
`switch (dayOfWeek) {
     case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Working Day");
     case SATURDAY, SUNDAY -> System.out.println("Day Off");
 }` 

### Pattern Matching
This was formally introduced in J14 as part of https://openjdk.java.net/jeps/305
While using instanceOf in If Statements - we should have explicitly typecast the object.
In J12, we can declare new typecasted var in if statement and use it.
`Object obj = "Hello World!";
if (obj instanceof String) {
    String s = (String) obj;
    int length = s.length();
}`
`if (obj instanceof String s) {
    int length = s.length();
}`

### Compact Number Formatting
It is the formatting applied to general-purpose numbers e.g. decimal, currency, percentage to make them compact due to space constraint. 
`public static NumberFormat getCompactNumberInstance(Locale locale, NumberFormat.Style formatStyle)`

### Teeing Collection
Teeing Collector is the new collector utility introduced in the Streams API.
This collector has three arguments – Two collectors and a Bi-function.
All input values are then passed to each collector and the result is available in the Bi-function.


### Other Features
Shenandoah: A Low-Pause-Time Garbage Collector
https://www.oracle.com/java/technologies/javase/12-relnote-issues.html
