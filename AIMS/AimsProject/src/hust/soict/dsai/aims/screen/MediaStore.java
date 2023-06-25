package hust.soict.dsai.aims.screen;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.cart.Cart;

public class MediaStore extends JPanel {
	private Media media;
	
    public MediaStore(Media media, Cart cart) {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel(""+media.getCost()+"$");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
	    if (media instanceof Playable) {
	        JButton playButton = new JButton("Play");
	        playButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    JDialog dialog = new JDialog();
                    dialog.setTitle(media.getTitle());
                    dialog.setSize(400, 300);
                    JScrollPane scrollPane = new JScrollPane(mediaLabel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                    
                    String mediaInfo = "<html>"+ media.playGUI().replace("\n", "<br/>") + "</html>";
                    JLabel mediaLabel = new JLabel(mediaInfo);
                    mediaLabel.setVerticalAlignment(JLabel.CENTER); 
                    mediaLabel.setHorizontalAlignment(JLabel.CENTER);
                    
                    
                    dialog.add(scrollPane);
                    dialog.setVisible(true);
                }
            });
            container.add(playButton);
        }
	    
	    
        JButton addToCartButton = new JButton("Add to cart");
        addToCartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, cart.addMedia(media));
            }
        });
        container.add(addToCartButton);
        
        
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
    }

}