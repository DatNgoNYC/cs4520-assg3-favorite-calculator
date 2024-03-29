Hi, 

This is an android app where you can use two different calculators. One with an ModelViewPresenter design, and the other with a ModelViewViewModel design.

We start by creating the main activity layout which will have the nav host fragment hosting our multi-fragmented app. We create the main activity class view.

We create the navgraph with two "actions" in the homepage fragment representing the transitions to the mvp_calc and the mvvm_calc.

We create the xml layouts and view fragments for all three pages.

All three fragments use viewbinding instead of findbyid.

The interesting thing is that MVVM uses the ViewModel class which also meant we had to write new boilerplate stuff for the "ViewModelProvider" (although im sure its important). This enables the mvvm_calc to save the resultfield even in a configuration change.



https://github.com/DatNgoNYC/cs4520-assg3-favorite-calculator/new/main?filename=README.md

________________________________________________________________________________________________________________________

Favorite calculator


Create a single activity calculator app. It contains a “HomeFragment”. 


This “HomeFragment” will be the first fragment users sees when they open the app. 


This fragment will have two buttons : MVP and MVVM at the centre of the screen stacked vertically. 
Clicking MVP open MVPFragment
Clicking MVVM opens MVVMFragment

 


Part 1 : MVP Architecture



Create a MVPFragment that will contain : 


2 number input fields 
A result field. 
Buttons for add, sub, multiply and divide operations
If its invalid/missing input, display a toast message.
Background for this fragment will be #c4b8e1Links to an external site.

Screenshots included in the starter app. Clicking each of the above buttons should perform the respected operation and the output of the calculation should be displayed in the result field.  



Remember : 


Use MVP architecture to implement the business logic.
Clear inputs after clicking any operation.
Fragments should depend on presenter abstraction and presenter should depend on view abstractions as discussed in class.
When the outcome of any operation is invalid due to incorrect input, display a toast message.

 


Part 2 : MVVM Architecture


Create a MVPFragment that will contain : 


2 number input fields 
A result field. 
Buttons for add, sub, multiply and divide operations
Background for this fragment will be #ffb3baLinks to an external site.

Screenshots included in the starter app. Click each of the above buttons should perform the respected operation and the output of the calculation should be displayed in the result field.  



Remember : 


Use MVVM architecture to implement the business logic.
Clear inputs after clicking any operation.
If its invalid/missing input, display a toast message.
When the outcome of any operation is invalid due to incorrect input, display a toast message.
The result displayed should survive orientation change without saving it to disk.

 


For the entire project, use view binding to inflate xml and refer views. Here is the link for the starter code  with screenshots- https://github.com/CustomAP/cs4520-assg3-starter-codeLinks to an external site.

Submission Guidelines :

Add a readme file to your project :
Provide a link to your github repo. 
Any other information needed to run project. 
Zip your android application and upload it to Canvas.
