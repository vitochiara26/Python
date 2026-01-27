"""Si ingresas un caracter numerico continuara"""
entrada = input("Ingresa un unico caracater, sea letra o numero: ")

while entrada in "0123456789" or entrada in "-1,-2,-3,-4,-5,-6,-7,-8,-9":
    if len(entrada) > 2:
        print("Introduce 'SOLO' un (1) unico caracter")
    entrada = input("Ingresa un unico caracater, sea letra o numero: ")

print("introdujo un caracter no numerico. Fin de la raza humana, digo, del programa")
