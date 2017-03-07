#version 330 core

in vec3 Colour;

out vec4 colour;

void main () {
	colour = vec4(Colour, 1.0f);
}