# toUpper

| Type                     	| Data Length 	| Byted Idx 	| Description                              	|
|--------------------------	|-------------	|-----------	|------------------------------------------	|
| IMEI                     	| 8Byte       	| [0..7]    	| 7Byte IMEI + 1Byte terminal              	|
| Gateway Type             	| 2Byte       	| [8,9]     	| enum of Gateway-Type-Table               	|
| Gateway                  	| 1Byte       	| [10]      	| enum of Gateway-FW-Version-Table         	|
| Type                     	| 1Byte       	| [11]      	| enum of Payload-Version-Table; Bit 8: 1= 	|
| Gateway Firmware Version 	| 2Byte       	| [12,13]   	| verschlüsselt 0= unverschlüsselt         	|
| Payload Version und      	| 4Byte       	| [0..3]    	| Format noch mit ECD festzulegen          	|
| Verschlüsselungs-Flag    	| 1Byte       	| [16]      	| signed long, UTC seconds                 	|
| Energiestatus            	| 4Byte       	| [4..7]    	| int                                      	|
| Timestamp                	| 4Byte       	| [8..11]   	| float                                    	|
| GPS class                	| 2Byte       	| [12..15]  	| float                                    	|
| Latitude                 	| 2Byte       	| [17,18]   	| int                                      	|
| Longitude                	| 15-38Byte   	| [0]       	| unsigned char                            	|
| Altitude (Meter)         	| 1Byte       	| [1..6]    	| Signalstärke in dB                       	|
| Number of Sensors        	| 6Byte       	| [7]       	| MAC address                              	|
|                          	| 1Byte       	| [8]       	| unsigned char, 0x07…0x1F                 	|
|                          	| 1Byte       	| [9,10]    	| 0xFF                                     	|
|                          	| 2Byte       	| [11,12]   	| 0x02A6                                   	|
|                          	| 2Byte       	| [13,14]   	| enum of Sensor-Type-Table                	|
|                          	| 2Byte       	| [15]      	| unsinged int                             	|
|                          	| 1Byte       	| [16]      	| unsigned char                            	|
|                          	| 1Byte       	| [17..37]  	| unsigned char                            	|
|                          	| 0-21Byte    	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
|                          	|             	|           	|                                          	|
