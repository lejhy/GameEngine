package renderEngine;

public class StaticShader extends ShaderProgram{
	
	private static final String VERTEX_FILE = "src/shaders/test.vert";
	private static final String FRAGMENT_FILE = "src/shaders/test.frag";

	public StaticShader() {
		super(VERTEX_FILE, FRAGMENT_FILE);
	}

	@Override
	protected void bindAttributes() {
		super.bindAttribute(0, "position");
		
	}

}
