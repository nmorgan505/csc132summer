from random import randint

class Student:
	def __init__(self, name, GPA):
		self.name = name
		self.gpa = GPA

	def dostuff(self):
		print(f"{self.name} has a {self.gpa} GPA.")


def main():

	list1 = [1, 2, 3, 4, 5, 6]
	list2 = []

	for i in range(len(list1)-1):
		list2[i] = randint(1,100)

	s1 = Student("Nikolas", 1.5)
	s2 = Student("John", 4.0)

	list3 = [s1, s2, list1, list2]

	print(list3)

main()
