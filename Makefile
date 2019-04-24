JFLAGS = -g
JC = javac
J = java
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java



CLASSES = \
	   Main.java \
	   Menu.java

           


default: classes

classes: $(CLASSES:.java=.class)

main: classes
		$(J) Main
clean:
		rm *.class
		
