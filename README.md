Hi, 

This is an android app where you can use two different calculators. One with an ModelViewPresenter design, and the other with a ModelViewViewModel design.

We start by creating the main activity layout which will have the nav host fragment hosting our multi-fragmented app. We create the main activity class view.

We create the navgraph with two "actions" in the homepage fragment representing the transitions to the mvp_calc and the mvvm_calc.

We create the xml layouts and view fragments for all three pages.

All three fragments use viewbinding instead of findbyid.

The interesting thing is that MVVM uses the ViewModel class which also meant we had to write new boilerplate stuff for the "ViewModelProvider" (although im sure its important). This enables the mvvm_calc to save the resultfield even in a configuration change.



https://github.com/DatNgoNYC/cs4520-assg3-favorite-calculator/new/main?filename=README.md
