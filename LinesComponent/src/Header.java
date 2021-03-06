
public class Header {
	// number of lines
	private static final int obstrucles=2;
	public float getobstrucles() {
		return obstrucles;
	}
	
	private class Line{
		private	float a,b,c,m,mp;		
		private float x_start,y_start;
		private float x_end,y_end;
		public void Line(float x_start,float y_start,float x_end,float y_end){
			this.x_start=x_start;
			this.y_start=y_start;
			this.x_end=x_end;
			this.y_end=y_end;
			a=x_end-x_start;
			b=y_start-y_end;
			c=(y_start*x_end)-(x_start*y_end);
			m=(y_end-y_start)/(x_end-x_start);
			mp=(-1)/(m);
		}
		public float getA() {
			return a;
		}
		
		public float getB() {
			return b;
		}
		
		public float getC() {
			return c;
		}
		
		public float getM() {
			return m;
		}
		
		public float getMp() {
			return mp;
		}
		
		public float getX_start() {
			return x_start;
		}
		
		public float getY_start() {
			return y_start;
		}
		
		public float getX_end() {
			return x_end;
		}
		
		public float getY_end() {
			return y_end;
		}
		
		
	}
	/**
	 * Ball class
	 */
	public class Ball{
		//initial coordinates
		public float x,y;
		//coordinates at time t
		public float xt,yt;
		//initial velocity
		public float ux,uy;
		//final velocity
		public float vx,vy;
		//speed of ball
		public double modV;
		public double getModV() {
			return modV;
		}
		public void setModV() {
		      //this.vx=vx;
		      //this.vy=vy;
		      double temp=(vx*vx)+(vy*vy);
		      modV=Math.sqrt(temp);
			
		}
		//collusion detection
		public int coll_flag;
		public boolean coll_dect; 

	}

}
