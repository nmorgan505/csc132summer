class Car:
	def __init__(self, name):
		self.tires = 4
		self.engine = True
		self.owner = name

	def __str__(self):
		return (f"Car:\nowner = {self.owner}\ntires = {self.tires}\nengine = {self.engine}")
		# return ("Car: owner = {}".format(self.owner))

class Bicycle:
	def __init__(self, name):
		self.tires = 2
		self.engine = False
		self.owner = name

	def __str__(self):
		return (f"Bicycle:\nowner = {self.owner}\ntires = {self.tires}\nengine = {self.engine}")




c1 = Car("Nikolas")
print(c1)
b1 = Bicycle("David")
print(b1)
