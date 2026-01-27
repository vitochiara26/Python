"""Ciclo for"""
mensaje = "Hola mundo!"

for letra in mensaje:
    print(letra)
print("\n")

for num in range(1,101,2):
    if num == 99 :
        print(num)
    print(num , end=", ")
print("\n")

for num in range(99,0,-2):
    if num == 1 :
        print(num)
    print(num, end=", ")


