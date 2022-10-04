# "√" "±"

import math
from fractions import Fraction

print("autosecondgradeequation.py v. Beta 0.4")
print(" ")
print('''"Esta herramienta hace ecuaciones de segundo grado en tan solo 1 segundo"''')
print(''' ''')
# print('Selecciona si es incompleta (1) o completa (2)')
# mode = input(int())

# if mode == 1:
	# A = input(int('Introduce A'))
	# C = input(int('Introduce C'))

	# CCambiada = -(C)
	# print(CCambiada)

A = int(input("Introduce 'a': "))
B = int(input("Introduce 'b': "))
C = int(input("Introduce 'c': "))

if A == 0:
	print(" ")
	print("'A' no puede ser 0")
	print(" ")
	input('''"Presione 'enter' para salir"''')

print(" ")

B1 = B ** 2

D = -4 * A * C

if D < 0:
	MENOSD = D * -1
	if MENOSD > B1:
		print("Tu ecuación no tiene solución real")
		print(" ")
		input('''"Presion 'enter' para salir"''')

RD = B1 + D

RQ = math.sqrt(RD)

X1 = -B + RQ
X2 = -B - RQ

X1STR = str(int(X1))
X2STR = str(int(X2))

X1FULL = X1 / (2 * A)
X2FULL = X2 / (2 * A)

X1FULLSTR = str(int(X1FULL))
X2FULLSTR = str(int(X2FULL))

if X1FULL != X2FULL:
	print("x1 = " + X1FULLSTR)
	print("x2 = " + X2FULLSTR)

	print(' ')

	print('x1 sin dividirlo = ' + X1STR)
	print('x2 sin dividirlo = ' + X2STR)


if X1FULL == X2FULL:
	print('''"Tu solución es doble"''')
	print(" ")
	print("x1 = " + X1FULLSTR)
	print("x2 = " + X2FULLSTR)




print(" ")
print("Si tus números son periódicos o negativos no los podras pasar a Fracción con esta herramienta")
print(" ")
print('''"Presione '1' + 'enter' para salir"''')
print('''"Presione '2' + 'enter' para pasar x1 a fracción"''')
print('''"Presione '3' + 'enter' para pasar x2 a fracción"''')
print('''"Presione '4' + 'enter' para pasar x1 y x2 a fracción"''')
print(" ")
choose = str(input("Escriba aquí: "))

if choose == "1":
	print("endl")

if choose == "2":
	X1FRACTION = Fraction(X1FULL)
	X1FRACTIONSTR = str(float(X1FRACTION))
	print(X1FRACTION)
	print(" ")
	input("Presione 'enter' para continuar")

if choose == "3":
	X2FRACTION = Fraction(X2FULL)
	X2FRACTIONSTR = str(float(X2FRACTION))
	print(X2FRACTION)
	print(" ")
	input("Presione 'enter' para continuar")

if choose == "4":
	X2FRACTION = Fraction(X2FULL)
	X2FRACTIONSTR = str(float(X2FRACTION))
	X1FRACTION = Fraction(X1FULL)
	X1FRACTIONSTR = str(float(X1FRACTION))
	print(X1FRACTION)
	print(X2FRACTION)
	print(" ")
	input("Presione 'enter' para continuar")