import abc # abstract base class

class Animal(metaclass = abc.ABCMeta): # allows us to use the abc library to make an abstract
				       # method; also declares animal to be an abstract class

	def __init__(self):
		""" Consructs a new Animal """

	@abc.abstractmethod
	def communicate(self):
		""" How an animal communicates """

class Bird(Animal):
	def __init__(self):
		""" Constructs a new Bird """

	def communicate(self):
		print("A bird communicates")

b1 = Bird()
b1.communicate()

A1 = Animal()
