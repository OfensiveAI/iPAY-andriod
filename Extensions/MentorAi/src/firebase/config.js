import { initializeApp } from 'firebase/app';
import { getAuth } from 'firebase/auth';
import { getFirestore } from 'firebase/firestore';
import { getAnalytics } from 'firebase/analytics';

const firebaseConfig = {
  apiKey: "AIzaSyDbgDgCwDEt4FUGOLvVgjjgWmzg7V5L4BI",
  authDomain: "mentorai-36c56.firebaseapp.com",
  projectId: "mentorai-36c56",
  storageBucket: "mentorai-36c56.firebasestorage.app",
  messagingSenderId: "932378674229",
  appId: "1:932378674229:web:5acc252afb5703159edd7c",
  measurementId: "G-50RR1BGR03"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const auth = getAuth(app);
const db = getFirestore(app);
const analytics = getAnalytics(app);

export { app, auth, db, analytics };