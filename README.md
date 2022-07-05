# CODAPI
Java FX Application to display COD statistics

To use the application, after building and running it, there will be a input text field that prompts the user to
enter their activision username.  It must include the name, #, and the proceeding numbers. Example John Doe#123.
Once entering the username. The program will retrieve the data through an HTTP request. The response contains
a lot of data, but at the moment, the application only displays the data for weapon statistics for each weapon class,
excluding melee. The user can click on the side panel buttons to sort by an individual weapon class or the "All Weapon"
button for all. Clicking on a column will sort it in ascending order, clicking on it again will sort in descending order.
