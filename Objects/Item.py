class Fruit:
	def __init__(self, o, f):
		self.origin = o
		self.fresh = f

	def __str__(self):
		return "I am a fruit!"

class SaleItem:
	def __init__(self, p, i, l):
		self.price = p
		self.inventory = i
		self.location = l

	def sell(self, quantity):
		pass
	def buy(self, quantity):
		pass
	def move(self, newLocation):
		pass

	def __str__(self):
		return "I am a Sale Item!"

class Banana(Fruit, SaleItem):
	def __init__(self, o, f, p, i, l):
		super().__init__(o, f)
		SaleItem.__init__(self, p, i, l)
	def __str__(self):
		supers = super().__str__() +'\n' + SaleItem.__str__(self)
		return supers

b1 = Banana("South America", True, .99, 25, "Aisle B4")
print(b1)
