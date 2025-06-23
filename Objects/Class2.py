class Vehicle:
	def __init__(self, name):
		self.tires = None
		self.engine = None
		self.owner = name

	def __str__(self):
		return f"owner={self.owner}\nengine={self.engine}\ntires={self.tires}\n"

class Cycle(Vehicle):
	def __init__(self, name):
		super().__init__(name)
		self.tires = 2

	def __str__(self):
		return super().__str__()

class Car(Vehicle):
	def __init__(self, name):
		super().__init__(name)
		self.tires = 4
		self.engine = True
	def __str__(self):
		return f"Car:\n" + super().__str__()

class Bicycle(Cycle):
	def __init__(self, name):
		super().__init__(name)
		self.engine = False
	def __str__(self):
		return f"Bicycle:\n" + super().__str__()

class Motorcycle(Cycle):
	def __init__(self, name):
		super().__init__(name)
		self.Engine = True
	def __str__(self):
		return f"Motorcycle:\n" + super().__str__()

c1 = Car("David")
b1 = Bicycle("Brent")
m1 = Motorcycle("Brandon")

print(c1)
print(b1)
print(m1)
