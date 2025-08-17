import pandas as pd

# Lee el archivo csv
df_gobierno = pd.read_csv('datos_redes_sociales.csv')

# Muestra en pantalla la diferencia de seguidores entre el mes de enero y junio en twitter
seguidoresTwitterEnero = int(df_gobierno.iloc[7, 3])
seguidoresTwitterJunio = int(df_gobierno.iloc[7, 8])
diferenciaSeguidoresTwitter = seguidoresTwitterJunio - seguidoresTwitterEnero

print(f"La diferencia de seguidores en Twitter entre enero y junio es de: {diferenciaSeguidoresTwitter}")

print(f"\n")

# Calcula la diferencia de visualizaciones de youtube entre los meses seleccionados por teclado
print("Opciones disponibles para el mes:")
print("1. Enero")
print("2. Febrero")
print("3. Marzo")
print("4. Abril")
print("5. Mayo")
print("6. Junio")
print("7. Julio")
print("8. Agosto")
print("9. Septiembre")
print("10. Octubre")
print("11. Noviembre")
print("12. Diciembre")

print(f"\n")

primerMes = int(input("Ingrese el primer mes: "))
segundoMes = int(input("Ingrese el segundo mes: "))

if primerMes == 1:
  nombrePrimerMes = "Enero"
if primerMes == 2:
  nombrePrimerMes = "Febrero"
if primerMes == 3:
  nombrePrimerMes = "Marzo"
if primerMes == 4:
  nombrePrimerMes = "Abril"
if primerMes == 5:
  nombrePrimerMes = "Mayo"
if primerMes == 6:
  nombrePrimerMes = "Junio"
if primerMes == 7:
  nombrePrimerMes = "Julio"
if primerMes == 8:
  nombrePrimerMes = "Agosto"
if primerMes == 9:
  nombrePrimerMes = "Septiembre"
if primerMes == 10:
  nombrePrimerMes = "Octubre"
if primerMes == 11:
  nombrePrimerMes = "Noviembre"
if primerMes == 12:
  nombrePrimerMes = "Diciembre"

if segundoMes == 1:
  nombreSegundoMes = "Enero"
if segundoMes == 2:
  nombreSegundoMes = "Febrero"
if segundoMes == 3:
  nombreSegundoMes = "Marzo"
if segundoMes == 4:
  nombreSegundoMes = "Abril"
if segundoMes == 5:
  nombreSegundoMes = "Mayo"
if segundoMes == 6:
  nombreSegundoMes = "Junio"
if segundoMes == 7:
  nombreSegundoMes = "Julio"
if segundoMes == 8:
  nombreSegundoMes = "Agosto"
if segundoMes == 9:
  nombreSegundoMes = "Septiembre"
if segundoMes == 10:
  nombreSegundoMes = "Octubre"
if segundoMes == 11:
  nombreSegundoMes = "Noviembre"
if segundoMes == 12:
  nombreSegundoMes = "Diciembre"

print(f"\n")

visualizacionesYoutubePrimerMes = int(df_gobierno.iloc[15, primerMes + 2])
visualizacionesYoutubeSegundoMes = int(df_gobierno.iloc[15, segundoMes + 2])
diferenciaVisualizacionesYoutube = visualizacionesYoutubeSegundoMes - visualizacionesYoutubePrimerMes
if diferenciaVisualizacionesYoutube >= 0:
    print(f"Hubo un aumento en las visualizaciones de Youtube entre los meses de {nombrePrimerMes} y {nombreSegundoMes} de {diferenciaVisualizacionesYoutube} visualizaciones")
else:
    print(f"Hubo una caida en las visualizaciones de Youtube entre los meses {nombrePrimerMes} y {nombreSegundoMes} de {-diferenciaVisualizacionesYoutube} visualizaciones")

print(f"\n")

# Calcula el promedio de crecimiento de twitter y facebook entre los meses de enero a junio.
crecimientoTwitterEnero = int(df_gobierno.iloc[8, 3])
crecimientoTwitterFebrero = int(df_gobierno.iloc[8, 4])
crecimientoTwitterMarzo = int(df_gobierno.iloc[8, 5])
crecimientoTwitterAbril = int(df_gobierno.iloc[8, 6])
crecimientoTwitterMayo = int(df_gobierno.iloc[8, 7])
crecimientoTwitterJunio = int(df_gobierno.iloc[8, 8])
crecimientoFacebookEnero = int(df_gobierno.iloc[1, 3])
crecimientoFacebookFebrero = int(df_gobierno.iloc[1, 4])
crecimientoFacebookMarzo = int(df_gobierno.iloc[1, 5])
crecimientoFacebookAbril = int(df_gobierno.iloc[1, 6])
crecimientoFacebookMayo = int(df_gobierno.iloc[1, 7])
crecimientoFacebookJunio = int(df_gobierno.iloc[1, 8])

promedioCrecimientoTwitter = (crecimientoTwitterEnero + crecimientoTwitterFebrero + crecimientoTwitterMarzo + crecimientoTwitterAbril + crecimientoTwitterMayo + crecimientoTwitterJunio) / 6 
promedioCrecimientoFacebook = (crecimientoFacebookEnero + crecimientoFacebookFebrero + crecimientoFacebookMarzo + crecimientoFacebookAbril + crecimientoFacebookMayo + crecimientoFacebookJunio) / 6

print(f"El promedio de crecimiento de Twitter entre Enero y Junio es de: {promedioCrecimientoTwitter:.2f} followers")
print(f"El promedio de crecimiento de Facebook entre Enero y Junio es de: {promedioCrecimientoFacebook:.2f} seguidores")

print(f"\n")


# Calcular el promedio de ”Me gusta” de youtube, twitter y facebook

meGustaYoutubeEnero = int(df_gobierno.iloc[17, 3])
meGustaYoutubeFebrero = int(df_gobierno.iloc[17, 4])
meGustaYoutubeMarzo = int(df_gobierno.iloc[17, 5])
meGustaYoutubeAbril = int(df_gobierno.iloc[17, 6])
meGustaYoutubeMayo = int(df_gobierno.iloc[17, 7])
meGustaYoutubeJunio = int(df_gobierno.iloc[17, 8])
meGustaYoutubeJulio = int(df_gobierno.iloc[17, 9])
meGustaYoutubeAgosto = int(df_gobierno.iloc[17, 10])
meGustaYoutubeSeptiembre = int(df_gobierno.iloc[17, 11])
meGustaYoutubeOctubre = int(df_gobierno.iloc[17, 12])
meGustaYoutubeNoviembre = int(df_gobierno.iloc[17, 13])
meGustaYoutubeDiciembre = int(df_gobierno.iloc[17, 14])

promedioMeGustaYoutube = (meGustaYoutubeEnero + meGustaYoutubeFebrero + meGustaYoutubeMarzo + meGustaYoutubeAbril + meGustaYoutubeMayo + meGustaYoutubeJunio + meGustaYoutubeJulio + meGustaYoutubeAgosto + meGustaYoutubeSeptiembre + meGustaYoutubeOctubre + meGustaYoutubeNoviembre + meGustaYoutubeDiciembre) / 12

print(f"El promedio de me gusta de Youtube es de: {promedioMeGustaYoutube:.2f}")

meGustaTwitterEnero = int(df_gobierno.iloc[12, 3])
meGustaTwitterFebrero = int(df_gobierno.iloc[12, 4])
meGustaTwitterMarzo = int(df_gobierno.iloc[12, 5])
meGustaTwitterAbril = int(df_gobierno.iloc[12, 6])
meGustaTwitterMayo = int(df_gobierno.iloc[12, 7])
meGustaTwitterJunio = int(df_gobierno.iloc[12, 8])
meGustaTwitterJulio = int(df_gobierno.iloc[12, 9])
meGustaTwitterAgosto = int(df_gobierno.iloc[12, 10])
meGustaTwitterSeptiembre = int(df_gobierno.iloc[12, 11])
meGustaTwitterOctubre = int(df_gobierno.iloc[12, 12])
meGustaTwitterNoviembre = int(df_gobierno.iloc[12, 13])
meGustaTwitterDiciembre = int(df_gobierno.iloc[12, 14])

promedioMeGustaTwitter = (meGustaTwitterEnero + meGustaTwitterFebrero + meGustaTwitterMarzo + meGustaTwitterAbril + meGustaTwitterMayo + meGustaTwitterJunio + meGustaTwitterJulio + meGustaTwitterAgosto + meGustaTwitterSeptiembre + meGustaTwitterOctubre + meGustaTwitterNoviembre + meGustaTwitterDiciembre) / 12

print(f"El promedio de me gusta de Twitter es de: {promedioMeGustaTwitter:.2f}")

meGustaFacebookEnero = int(df_gobierno.iloc[4, 3])
meGustaFacebookFebrero = int(df_gobierno.iloc[4, 4])
meGustaFacebookMarzo = int(df_gobierno.iloc[4, 5])
meGustaFacebookAbril = int(df_gobierno.iloc[4, 6])
meGustaFacebookMayo = int(df_gobierno.iloc[4, 7])
meGustaFacebookJunio = int(df_gobierno.iloc[4, 8])
meGustaFacebookJulio = int(df_gobierno.iloc[4, 9])
meGustaFacebookAgosto = int(df_gobierno.iloc[4, 10])
meGustaFacebookSeptiembre = int(df_gobierno.iloc[4, 11])
meGustaFacebookOctubre = int(df_gobierno.iloc[4, 12])
meGustaFacebookNoviembre = int(df_gobierno.iloc[4, 13])
meGustaFacebookDiciembre = int(df_gobierno.iloc[4, 14])

promedioMeGustaFacebook = (meGustaFacebookEnero + meGustaFacebookFebrero + meGustaFacebookMarzo + meGustaFacebookAbril + meGustaFacebookMayo + meGustaFacebookJunio + meGustaFacebookJulio + meGustaFacebookAgosto + meGustaFacebookSeptiembre + meGustaFacebookOctubre + meGustaFacebookNoviembre + meGustaFacebookDiciembre) / 12

print(f"El promedio de me gusta de Facebook es de: {promedioMeGustaFacebook:.2f}")
