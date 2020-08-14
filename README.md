# Android and Sklearn Porter

Sklearn is a beginner based Machine Learning Library. The models made with sklearn can be used in Android by converting the python code to java code. The sklearn_porter library converts the python code into many others languages primarily java. 

Here I made a simple dataset of geometry quadrant analysis. Feeded the data into MLPClassifier of sklearn. After that the python code was converted into java code with the help of sklearn_porter.

A new Android Studio project was created. Necessary UI elements added. After that the Java class file generated as included as Java Class file in Android project.

A few changes in the generated java code was reqd which I will mention it flows.
Also with more recent versions of sklearn a common error is noticed which will also be fixed.


### Installation of sklearn_porter

The [sklearn-porter](https://pypi.org/project/sklearn-porter/0.7.4/) library is reqd to convert the python code to java code.

Install the dependencies.

```sh
pip install sklearn-porter==0.7.4
```
### Creating python model

- A jupyter notebook named Data_Creater is for creating a dataset and exporting as csv
- Classifier notebook creates a MLPClassifier model
- In the notebook at the end the reqd java code is generated

### Errors using sklearn_porter

- "ValueError: invalid literal for int() with base 10: 'post1' "

You might come as across this kind of error. This can be solved by going into the sklearn_porter library files and making some changes.
#####  Solution:
 - Open 
C:\Users\<USER>\AppData\Local\Programs\Python\Python37\Lib\site-packages\sklearn_porter\Porter.py
- In around line-6O of the Porter.py file in '# Determine the local version of sklearn:' 
    replace  "  sklearn_ver = .... "
                with  
            " sklearn_ver = '0.22.2'.split('.') " as your sklearn version is.
- Save the file. Your error should be resolved.

### Creating Android Project

- Choose your language and create project.
- Android sample project is there in the Android App folder
- Create Necessary UI
- For android java class name and file name should be same so either do it in the notebook while creating java code or manually rename as necessary.
- Note main function of Java class prints the output so change the return type of the function and return the output to the Main Activity. Sample code is the android folder.
- Note here the classifier classification starts from O so increment it by 1. Also you can change the classification index from the java classifier file.

### Expect Output

This should work and you would be able to run the same python model in android.



