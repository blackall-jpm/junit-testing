# Header This is a quick use of markdown language
Header H1 above is used to display the Project heading. 

## Sub Headings are like this
Sub Topic Headings H2 is used for sub sections like Configurations, Authors etc.

````
pip install boto
````

The above formatting is used to create a box which can display code or command in a well formatted manner.


## Usage

Below is another example of displaying
````java
import csv

with open("sample.csv","r") as csvinput: # read input csv file
    reader = csv.reader(csvinput) # create a reader
    for row in reader:
        print(row[0])
````
