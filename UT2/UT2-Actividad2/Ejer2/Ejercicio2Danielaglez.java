����   = G  *ejerciciosRescueltos/Ejercicio2Danielaglez  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this ,LejerciciosRescueltos/Ejercicio2Danielaglez; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   !introduce la base del triangulo: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
nextDouble ()D , #introduce la altura del triangulo: @        0 java/lang/StringBuilder 2 el area del triangulo es: 
 / 4  &
 / 6 7 8 append (D)Ljava/lang/StringBuilder;
 / : ; < toString ()Ljava/lang/String; args [Ljava/lang/String; teclado Ljava/util/Scanner; b D h area 
SourceFile Ejercicio2Danielaglez.java !               /     *� �    
                    	       �     H� Y� � L� � !+� 'I� +� !+� '9(k -o9� � /Y1� 3� 5� 9� !�    
   "              &  0  G     4    H = >    = ? @   0 A B  & " C B  0  D B   E    F