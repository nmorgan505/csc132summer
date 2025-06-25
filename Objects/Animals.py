class Animal:
	def __init__(self):
		""" Constructs a new animal"""

	def communicate(self): # this will be the abstract method
		raise NotImplementedError("Abstract method communicate not implemented in subclass!"

class Bird(Animal):
	def __init__(self):
		"""Constructs a new Bird"""

	def communicate(self):
		""" A bird communicates"""
b1 = Bird()
b1.communicate()
