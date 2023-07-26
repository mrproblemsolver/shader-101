package shader101;
import java.util.Random;
public class UnpackedColor {
    public float A, R, G, B;
    public UnpackedColor() {
        Random r = new Random();
        A = r.nextFloat();
        R = r.nextFloat();
        G = r.nextFloat();
        B = r.nextFloat();
        }
    public UnpackedColor(
        float A,
        float R,
        float G,
        float B
        ) {
        this.A = A;
        this.R = R;
        this.G = G;
        this.B = B;
        }
    }