\[ English | [Russian](README_RU.md) \]

<h1 align="center">
    <a href="https://github.com/woesss/JL-Mod" target="_blank"></a>
        <img height="50%" width="50%" src="screenshots/icon.png"><br>
</h1>
<h4 align="center">Experimental mod of the <a href="https://github.com/nikita36078/J2ME-Loader" target="_blank">J2ME Loader</a> with support for games developed for the 3D engine "Mascot Capsule v3"
</h4>

[![GitHub release (latest by date)](https://img.shields.io/github/v/release/woesss/JL-Mod?style=plastic)](https://github.com/woesss/JL-Mod/releases/latest)
[![donate](https://img.shields.io/badge/donate-PayPal-%234D8A99?style=plastic)](https://www.paypal.me/j2meforever)
[![donate](https://img.shields.io/badge/donate-qiwi-%234D8A20?style=plastic)](https://my.qiwi.com/Yuryi-Khk_7vnCWvd)  

**[Download APK](https://github.com/woesss/JL-Mod/releases/latest)**

|   |   |   |
| ----- | ----- | ----- |
| <img src="screenshots/s1.png" width="240"> | <img src="screenshots/s2.png" width="240"> | <img src="screenshots/s3.png" width="240"> |
| <img src="screenshots/s4.png" width="240"> | <img src="screenshots/s5.png" width="240"> | <img src="screenshots/s6.png" width="240"> |
| <img src="screenshots/s7.png" width="240"> | <img src="screenshots/s8.png" width="240"> | <img src="screenshots/s9.png" width="240"> |

### **!!!Attention!!!**

**Some settings have been changed in the mod. J2ME Loader may not work correctly with games, templates and settings installed or configured by the mod and vice versa. In order not to have to reinstall-reconfigure, it is better to make a backup, copy or not specify the same working directory for the mod and J2ME Loader.**

#### **Using shaders (image post-processing filters)**

Supports the same shader format as [PPSSPP](https://www.ppsspp.org)
To use, you need to put them in the `shaders` folder in the working directory of the emulator,
then in the game profile, select the graphics output mode: "**Hardware acceleration (OpenGL ES)**" and select the desired shader.
Some shaders have settings - when you select one, an icon will appear next to the name, when you click on it, a window with settings will open
A small collection of compatible shaders can be found in this repository: https://github.com/woesss/ppsspp_shaders/archive/refs/heads/master.zip

#### **Mascot Capsule v3 support**
implementation is not accurate, there are unresolved problems

In some games (seen in "Medal of Honor") the 3D scene may not be displayed due to the overlap with the 2D background.
Try adding the following line to the "System Properties" field:
**micro3d.v3.render.no-mix2D3D: true**
If it doesn't help, please report this game in **[bug-report](https://github.com/woesss/JL-Mod/issues/new?assignees=&labels=bug&template=issue-template.md&title=)** or in another way.

Another one property turns on the texture filter (built into OpenGL), but this can generate distortion in the form of extra texels being captured at the edges of polygons:
**micro3d.v3.texture.filter: true**
without this setting, the quality of the textures is as close to the original as possible and looks more vintage.

#### **Porting**
Added the ability to build an Android application from the source code of a J2ME application using the code of this project  
Read more in the [Wiki](https://github.com/woesss/JL-Mod/wiki/Porting-midlet-instruction)

#### **External links**  
Emulation General Wiki:  
[JL-Mod](http://emulation.gametechwiki.com/index.php/JL-Mod)  
[Mascot Capsule 3D](http://emulation.gametechwiki.com/index.php/Mascot_Capsule_3D)  
[Mascot Capsule 3D compatibility list](https://emulation.gametechwiki.com/index.php/Mascot_Capsule_3D_compatibility_list)  
