/**
 Nuevo wrapper con voz en español
 @author Marco Antonio Cruz
*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "fliteWrapper.h"

void init(){

}

void say (char *msg){
	 char cmd[1024];
         memset(cmd, '\0', 1024);
	 strncat(cmd, "espeak -ves+f5 \"", 16);
	 strncat(cmd, msg, 1000);
	 strncat(cmd, "\"", 1);
	 system(cmd);
}
